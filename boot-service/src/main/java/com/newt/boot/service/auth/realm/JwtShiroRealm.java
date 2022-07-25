package com.newt.boot.service.auth.realm;


import com.newt.boot.service.auth.token.JwtToken;
import com.newt.boot.service.biz.UserService;
import com.newt.boot.service.dto.UserDto;
import com.newt.boot.service.utils.security.JwtUtil;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * jwt鉴权授权场景
 */
public class JwtShiroRealm extends AuthorizingRealm {

   // @Autowired
    private UserService userService;

    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof JwtToken;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        JwtToken jwtToken = (JwtToken) authenticationToken;
        String token = jwtToken.getToken();
        String deviceId = jwtToken.getDeviceId();

        UserDto user = userService.getJwtTokenInfo(JwtUtil.getLogin(token));
        if (user == null || !deviceId.equals(user.getDeviceId())) {
            throw new AuthenticationException("token过期，请重新登录");
        }
        String salt = user.getSalt();
        user.setSalt(null);

        return new SimpleAuthenticationInfo(user, salt, getName());
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return new SimpleAuthorizationInfo();
    }
}
