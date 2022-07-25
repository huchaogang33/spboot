package com.newt.boot.service.auth;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

import com.newt.boot.common.constants.CommonConstant;
import com.newt.boot.common.enums.ErrorCodeEnum;
import com.newt.boot.common.response.BaseResponseBuilder;
import com.newt.boot.service.auth.token.JwtToken;
import com.newt.boot.service.biz.UserService;
import com.newt.boot.service.dto.UserDto;
import com.newt.boot.service.utils.security.JwtUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.AuthenticatingFilter;
import org.apache.shiro.web.util.WebUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class JwtAuthFilter extends AuthenticatingFilter {

    private static final Logger logger = LoggerFactory.getLogger(JwtAuthFilter.class);

    protected UserService userService;

    public JwtAuthFilter(UserService userService) {
        this.userService = userService;
    }

    @Override
    protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) {
        if (this.isLoginRequest(request, response))
            return true;
        boolean allowed = false;
        try {
            allowed = executeLogin(request, response);
        } catch (IllegalStateException e) { //not found any token
            logger.error("未找到任何token");
        } catch (Exception e) {
            logger.error("登陆时出现异常", e);
        }
        return allowed || super.isPermissive(mappedValue);
    }

    @Override
    protected AuthenticationToken createToken(ServletRequest servletRequest, ServletResponse servletResponse) {
        String jwtToken = JwtUtil.getAuthzHeader(servletRequest);
        String deviceId = JwtUtil.getDeviceId(servletRequest);
        if (StringUtils.isNotBlank(jwtToken) && !JwtUtil.isTokenExpired(jwtToken) && StringUtils.isNotBlank(deviceId))
            return new JwtToken(jwtToken, deviceId);

        return null;
    }

    /**
     * 如果这个Filter在之前isAccessAllowed（）方法中返回false,则会进入这个方法。我们这里直接返回错误的response
     */
    @Override
    protected boolean onAccessDenied(ServletRequest servletRequest, ServletResponse servletResponse) {
        HttpServletResponse httpResponse = WebUtils.toHttp(servletResponse);
        httpResponse.setCharacterEncoding("UTF-8");
        httpResponse.setContentType("application/json;charset=UTF-8");
        //httpResponse.setStatus(HttpStatus.SC_OK);
        fillCorsHeader(WebUtils.toHttp(servletRequest), httpResponse);
        try {
            PrintWriter writer = servletResponse.getWriter();
            writer.print(JSONObject.toJSONString(BaseResponseBuilder.fail(null, ErrorCodeEnum.NOT_AUTHORIZED), SerializerFeature.WriteMapNullValue,
                    SerializerFeature.WriteDateUseDateFormat));
            writer.close();
            servletResponse.flushBuffer();
        }catch (IOException e){
            logger.error("会话过期处理发生异常", e);
        }
        return false;
    }

    /**
     * 如果Shiro Login认证成功，会进入该方法，等同于用户名密码登录成功，我们这里还判断了是否要刷新Token
     */
    @Override
    protected boolean onLoginSuccess(AuthenticationToken token, Subject subject, ServletRequest request, ServletResponse response) throws Exception {
        HttpServletResponse httpResponse = WebUtils.toHttp(response);
        String newToken = null;
        if (token instanceof JwtToken) {
            JwtToken jwtToken = (JwtToken) token;
            UserDto user = (UserDto) subject.getPrincipal();
            boolean shouldRefresh = JwtUtil.shouldTokenRefresh(JwtUtil.getIssuedAt(jwtToken.getToken()));
            if (shouldRefresh) {
                newToken = this.userService.generateJwtToken(user.getLogin(), user.getDeviceId());
            }else {
                newToken = jwtToken.getToken();
            }
        }
        if (StringUtils.isNotBlank(newToken))
            httpResponse.setHeader(CommonConstant.X_AUTH_TOKEN, newToken);

        return true;
    }

    /**
     * 如果调用shiro的login认证失败，会回调这个方法，这里我们什么都不做，因为逻辑放到了onAccessDenied（）中。
     */
    @Override
    protected boolean onLoginFailure(AuthenticationToken token, AuthenticationException e, ServletRequest request, ServletResponse response) {
        logger.error("Validate token fail, token:{}, error:{}", token.toString(), e.getMessage());
        return false;
    }

    protected void fillCorsHeader(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        httpServletResponse.setHeader("Access-control-Allow-Origin", httpServletRequest.getHeader("Origin"));
        httpServletResponse.setHeader("Access-Control-Allow-Methods", "GET,POST,OPTIONS,HEAD");
        httpServletResponse.setHeader("Access-Control-Allow-Headers",
                httpServletRequest.getHeader("Access-Control-Request-Headers"));
    }
}
