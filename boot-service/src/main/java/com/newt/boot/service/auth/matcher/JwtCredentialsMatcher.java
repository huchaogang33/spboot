package com.newt.boot.service.auth.matcher;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.newt.boot.common.constants.CommonConstant;
import com.newt.boot.common.constants.LogDefine;
import com.newt.boot.service.dto.UserDto;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.credential.CredentialsMatcher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JwtCredentialsMatcher implements CredentialsMatcher {

    private static final Logger logger = LoggerFactory.getLogger(LogDefine.SERVICE_DETAIL);

    @Override
    public boolean doCredentialsMatch(AuthenticationToken authenticationToken, AuthenticationInfo authenticationInfo) {
        String token = (String) authenticationToken.getCredentials();
        Object stored = authenticationInfo.getCredentials();
        String salt = stored.toString();

        UserDto user = (UserDto) authenticationInfo.getPrincipals().getPrimaryPrincipal();
        try {
            Algorithm algorithm = Algorithm.HMAC256(salt);
            JWTVerifier verifier = JWT.require(algorithm)
                    .withClaim(CommonConstant.JWT_LOGIN, user.getLogin())
                    .withClaim(CommonConstant.JWT_DEVICE_ID, user.getDeviceId())
                    .build();
            verifier.verify(token);
            return true;
        } catch (JWTVerificationException e) {
            logger.error("Token Error:{}", e.getMessage());
        }
        return false;
    }
}
