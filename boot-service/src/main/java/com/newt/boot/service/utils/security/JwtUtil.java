package com.newt.boot.service.utils.security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.interfaces.DecodedJWT;

import com.newt.boot.common.constants.CommonConstant;
import com.newt.boot.service.dto.UserDto;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.SimplePrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class JwtUtil {

    private static final Logger logger = LoggerFactory.getLogger(JwtUtil.class);

    public static String getLogin(String token) {
        if (StringUtils.isEmpty(token)) {
            return null;
        }
        try {
            DecodedJWT jwt = JWT.decode(token);
            return jwt.getClaim(CommonConstant.JWT_LOGIN).asString();
        } catch (JWTCreationException e) {
            return null;
        }
    }

   /* public static String getAuthzHeader(ServletRequest servletRequest) {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        return request.getHeader(CommonConstant.X_AUTH_TOKEN);
    }*/
    
    //刘子良 2021-12-01 18:59 modify
    public static String getAuthzHeader(ServletRequest servletRequest) {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String authToken  = request.getParameter("x-auth-token");
        logger.info("请求Header中请求的com.newland.receipt.mchs.service.utils.security.JwtUtil.getAuthzHeader-authToken:{},",authToken);
        if(StringUtils.isBlank(authToken)) {
        	authToken = request.getHeader(CommonConstant.X_AUTH_TOKEN);
        	logger.info("请求Url中请求的com.newland.receipt.mchs.service.utils.security.JwtUtil.getAuthzHeader-authToken:{},",authToken);
        }
        return authToken ;
    }
    
    

    /*public static String getDeviceId(ServletRequest servletRequest) {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        return request.getHeader(CommonConstant.X_AUTH_DEVICE);
    }*/
    
    //刘子良 2021-12-01 18:59 modify
    public static String getDeviceId(ServletRequest servletRequest) {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String deviceId = request.getParameter("x-auth-device");
        if(StringUtils.isBlank(deviceId)) {
        	deviceId = request.getHeader(CommonConstant.X_AUTH_DEVICE);
        	logger.info("请求Url中请求的com.newland.receipt.mchs.service.utils.security.JwtUtil.getAuthzHeader-getDeviceId:{},",deviceId);
        }
        return deviceId;
    }

    public static boolean isTokenExpired(String token) {
        Date now = Calendar.getInstance().getTime();
        DecodedJWT jwt = JWT.decode(token);
        return jwt.getExpiresAt().before(now);
    }

    public static Date getIssuedAt(String token) {
        try {
            DecodedJWT jwt = JWT.decode(token);
            return jwt.getIssuedAt();
        } catch (JWTDecodeException e) {
            return null;
        }
    }

    public static boolean shouldTokenRefresh(Date issueAt) {
        if (null == issueAt) {
            return true;
        }
        LocalDateTime issueTime = LocalDateTime.ofInstant(issueAt.toInstant(), ZoneId.systemDefault());
        return LocalDateTime.now().minusSeconds(CommonConstant.Token_Refresh_Interval).isAfter(issueTime);
    }

    public static String generateToken(String login, String deviceId, String salt) {
        try {
            if (StringUtils.isBlank(login)) {
                return null;
            }

            if (StringUtils.isBlank(deviceId)) {
                return null;
            }

            Date expireDate = new Date(System.currentTimeMillis() + CommonConstant.Token_Expire_Interval * 1000L);

            // 生成token
            Algorithm algorithm = Algorithm.HMAC256(StringUtils.isEmpty(salt) ? CommonConstant.DEFAULT_SALT : salt);
            return JWT.create()
                    .withClaim(CommonConstant.JWT_LOGIN, login)
                    .withClaim(CommonConstant.JWT_DEVICE_ID, deviceId)
                    // 签发人
                    .withIssuer("")
                    // 主题
                    .withSubject("")
                    // 签发的目标
                    .withAudience("")
                    // 签名时间
                    .withIssuedAt(new Date())
                    // token过期时间
                    .withExpiresAt(expireDate)
                    // 签名
                    .sign(algorithm);
        } catch (Exception e) {
            logger.error("generateToken exception", e);
        }
        return null;
    }

    public static String generateSalt() {
        SecureRandomNumberGenerator secureRandom = new SecureRandomNumberGenerator();
        return secureRandom.nextBytes(16).toHex();
    }

    public static UserDto getCurrentUser() {
        Subject subject = SecurityUtils.getSubject();
        if (!subject.isAuthenticated() || null == subject.getPrincipal()) {
            return null;
        }
        return (UserDto) subject.getPrincipal();
    }

    public static  void setUser(UserDto user){

        Subject subject = SecurityUtils.getSubject();



        PrincipalCollection principals = subject.getPrincipals();
        String realName = principals.getRealmNames().iterator().next();
        PrincipalCollection newPrincipals=new SimplePrincipalCollection(user,realName);
        subject.runAs(newPrincipals);
    }
}
