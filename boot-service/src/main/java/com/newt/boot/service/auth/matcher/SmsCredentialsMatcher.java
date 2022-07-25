package com.newt.boot.service.auth.matcher;


import com.newt.boot.common.constants.CommonConstant;
import com.newt.boot.common.constants.LogDefine;
import com.newt.boot.service.utils.RedissonLockUtil;
import org.apache.commons.lang.StringUtils;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.ExpiredCredentialsException;
import org.apache.shiro.authc.credential.CredentialsMatcher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SmsCredentialsMatcher implements CredentialsMatcher {
    private static final Logger logger = LoggerFactory.getLogger(LogDefine.SERVICE_DETAIL);

    private String redisRoot;

    private String isReference;

    private String smsWhitePhone;

    private String smsWhiteCode;

    public SmsCredentialsMatcher(String redisRoot,String isReference,String smsWhitePhone,String smsWhiteCode) {
        this.redisRoot = redisRoot;
        this.isReference = isReference;
        this.smsWhitePhone=smsWhitePhone;
        this.smsWhiteCode=smsWhiteCode;
    }

    @Override
    public boolean doCredentialsMatch(AuthenticationToken authenticationToken, AuthenticationInfo authenticationInfo) {
        logger.info("短信认证开始--->");
        String phone = (String) authenticationToken.getPrincipal();
        String code = (String) authenticationToken.getCredentials();

        String cacheCode = RedissonLockUtil.getValue(this.redisRoot.concat(CommonConstant.SMS_VALIDATE_PREFIX).concat(phone));
        logger.info("短信认证:缓存code:{},请求code:{},手机号:{},是否挡板false使用:{}",cacheCode,code,phone,isReference);
        if ("true".equals(isReference)) {
            /// TODO: 2021/11/19 挡板默认000000成功
            /*if ("000000".equals(code))
                return true;*/
            if (StringUtils.isNotEmpty(smsWhitePhone)){
                String[] whitePhoneList = smsWhitePhone.split(",");
                for (String whitePhone : whitePhoneList) {
                    if (whitePhone.equals(phone)){
                        if(StringUtils.isEmpty(cacheCode)){
                            throw new ExpiredCredentialsException("验证信息已过期");
                        }
                        if (code.equals(cacheCode)) {
                            return true;
                        }else {
                            return false;
                        }
                    }
                }
            }
            if(StringUtils.isEmpty(cacheCode)){
                throw new ExpiredCredentialsException("验证信息已过期");
            }
            return code.equals(cacheCode);
        }
        return true;
    }
}
