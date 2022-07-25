package com.newt.boot.service.auth.realm;


import com.newt.boot.service.auth.token.SmsToken;
import com.newt.boot.service.biz.UserService;
import com.newt.boot.service.dto.UserDto;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 短信验证码鉴权授权场景
 */
public class SmsShiroRealm extends AuthorizingRealm {

    //@Autowired
    private UserService userService;


    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof SmsToken;
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return new SimpleAuthorizationInfo();
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        SmsToken smsToken = (SmsToken) authenticationToken;
        String login = smsToken.getPhone();

        UserDto user = userService.getUserInfoByLogin(login);
        if (user == null)
            throw new UnknownAccountException("手机号码不存在");

        user.setSalt(null);

        return new SimpleAuthenticationInfo(user, smsToken.getCode(), getName());
    }
}
