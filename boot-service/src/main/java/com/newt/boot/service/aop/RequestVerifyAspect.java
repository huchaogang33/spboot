package com.newt.boot.service.aop;


import cn.hutool.core.codec.Base64;
import cn.hutool.core.util.CharsetUtil;
import com.alibaba.fastjson.JSON;
import com.newt.boot.common.annotation.RequestVerify;
import com.newt.boot.common.constants.LogDefine;
import com.newt.boot.common.enums.ErrorCodeEnum;
import com.newt.boot.common.request.BaseRequest;
import com.newt.boot.common.response.BaseResponse;
import com.newt.boot.service.utils.RedissonLockUtil;
import com.newt.boot.service.utils.security.AesUtil;
import com.newt.boot.service.utils.security.RsaUtil;
import org.apache.commons.lang.StringUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
public class RequestVerifyAspect {

    private static final Logger logger = LoggerFactory.getLogger(LogDefine.CONTROLLER_DETAIL);

    @Pointcut("execution(public * *(..)) && @annotation(com.newt.boot.common.annotation.RequestVerify)")
    public void pointcut() {
    }

    @Value("${receipt.machs.redis.root}")
    private String redisRoot;

    @Around(value = "pointcut()")
    public Object process(ProceedingJoinPoint pjp) throws Throwable {
        logger.info("接口具体类方法:{}",pjp.getSignature());
        logger.info("需要进行参数加解密验证的方法:{}", pjp.getSignature().getName());
        Object[] args = pjp.getArgs();
        BaseRequest requestInfo = (BaseRequest) args[0];
        logger.info("前端请求原始报文信息:{}", JSON.toJSONString(requestInfo));
        BaseResponse responseInfo = new BaseResponse();
        MethodSignature methodSignature = (MethodSignature) pjp.getSignature();
        Method targetMethod = methodSignature.getMethod();
        RequestVerify requestVerify = targetMethod.getAnnotation(RequestVerify.class);
        String srcPubKey = RedissonLockUtil.getValue(this.redisRoot.concat("srcPubKey:" + requestInfo.getDeviceId()));
        String svcPriKey = RedissonLockUtil.getValue(this.redisRoot.concat("svcPriKey:" + requestInfo.getDeviceId()));
        if (requestVerify.encrypted()) {
            //请求信息做过加密处理
            if(decryptValidSign(requestInfo, responseInfo, svcPriKey, srcPubKey)){
                return responseInfo;
            }
            return signReturnInfo(pjp, requestInfo, responseInfo, svcPriKey);
        } else if (requestVerify.signed()) {
            //请求信息做过签名处理

            if (verify(requestInfo, responseInfo, srcPubKey)) {
                return responseInfo;
            }
            return signReturnInfo(pjp, requestInfo, responseInfo, svcPriKey);
        }
        return getObject(pjp, requestInfo, responseInfo);
    }

    private boolean decryptValidSign(BaseRequest request, BaseResponse response, String privateKey, String publicKey) {
        try {
            //获取对称秘钥
            String aesKey = RsaUtil.decrypt(privateKey,request.getSecretKey());
            //获取请求明文信息
            String srcContentBase64 = AesUtil.decrypt(aesKey, request.getBusinessInfo());
            //验签
            if (!RsaUtil.verify(publicKey, srcContentBase64, request.getSignature())) {
                logger.info("请求流水号:{},解密或签名验证失败", request.getSrcSerialNo());
                response.setSuccess("N");
                response.setRespCode(ErrorCodeEnum.INFO_VERIFY_FAILED.getCode());
                response.setRespMsg(ErrorCodeEnum.INFO_VERIFY_FAILED.getDesc());
                return true;
            }
            request.setBusinessInfo(Base64.decodeStr(srcContentBase64, CharsetUtil.CHARSET_UTF_8));
        } catch (Exception e) {
            logger.error("请求流水号:{},解密或签名验证异常:{}", request.getSrcSerialNo(), e.getMessage());
            response.setSuccess("N");
            response.setRespCode(ErrorCodeEnum.INFO_VERIFY_FAILED.getCode());
            response.setRespMsg(ErrorCodeEnum.INFO_VERIFY_FAILED.getDesc());
            return true;
        }
        return false;
    }

    private boolean verify(BaseRequest request, BaseResponse response, String publicKey) {
        String srcBizInfo = Base64.decodeStr(request.getBusinessInfo(), CharsetUtil.CHARSET_UTF_8);
        boolean result = RsaUtil.verify(publicKey, srcBizInfo, request.getSignature());
        if (!result) {
            response.setSuccess("N");
            response.setRespCode("");
            response.setRespMsg("验签失败");
            return true;
        }
        return true;
    }

    private Object signReturnInfo(ProceedingJoinPoint pjp, BaseRequest requestInfo, BaseResponse responseInfo, String privateKey) throws Throwable {
        try {
            Object object = pjp.proceed(new Object[]{requestInfo});
            responseInfo = (BaseResponse) object;
            String returnBusinessInfo = responseInfo.getBusinessInfo();
            // 无业务实体不进行加签
            if (StringUtils.isBlank(returnBusinessInfo)) {
                return responseInfo;
            }
            String returnBusinessInfoBase64 = Base64.encode(returnBusinessInfo, CharsetUtil.CHARSET_UTF_8);
            responseInfo.setBusinessInfo(returnBusinessInfoBase64);
            responseInfo.setSignature(RsaUtil.sign(privateKey, returnBusinessInfoBase64));
            return responseInfo;
        } catch (Exception e) {
            logger.error("来源方流水号:{},交易异常:{}", requestInfo.getSrcSerialNo(), e.getMessage());
            responseInfo.setSuccess("F");
            responseInfo.setRespCode("1000");
            responseInfo.setRespMsg("交易异常,请联系管理员");
            return responseInfo;
        }
    }

    private Object getObject(ProceedingJoinPoint pjp, BaseRequest requestInfo, BaseResponse responseInfo) throws Throwable {
        try {
            Object result = pjp.proceed();
            logger.info("返回前端原始报文信息:{}", JSON.toJSONString(result));
            return result;
        } catch (Exception e) {
            logger.error("请求流水号:{},交易异常:{}", requestInfo.getSrcSerialNo(), e);
            String message = e.getMessage();
            if (StringUtils.isNotEmpty(message)) {
                if (message.length()==6) {
                    ErrorCodeEnum enumByCode = ErrorCodeEnum.getEnumByCode(message);
                    if (null != enumByCode && !enumByCode.getCode().equals(ErrorCodeEnum.SUCCESS.getCode())){
                        responseInfo.setRespMsg(enumByCode.getDesc());
                        responseInfo.setSuccess("N");
                        responseInfo.setRespCode("1000");
                        return responseInfo;
                    }
                    /*if (ErrorCodeEnum.PHONE_NUM_NOT_EXIT.getCode().equals(message)) {
                        responseInfo.setRespMsg(ErrorCodeEnum.PHONE_NUM_NOT_EXIT.getDesc());
                    } else {
                        responseInfo.setRespMsg("交易异常,请联系管理员");
                    }*/
                }
            }
            responseInfo.setRespMsg("交易异常,请联系管理员");
            responseInfo.setSuccess("N");
            responseInfo.setRespCode("1000");
            return responseInfo;
        }
    }
}
