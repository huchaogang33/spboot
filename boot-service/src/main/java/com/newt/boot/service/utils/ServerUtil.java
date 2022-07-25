package com.newt.boot.service.utils;

import javax.servlet.http.HttpServletRequest;

/**
 * 服务相关配置
 *
 * @author 新大陆金融
 */
public class ServerUtil {
    public static String getDomain(HttpServletRequest request) {
        StringBuffer url = request.getRequestURL();
        String contextPath = request.getServletContext().getContextPath();
        return url.delete(url.length() - request.getRequestURI().length(), url.length()).append(contextPath).toString();
    }
}
