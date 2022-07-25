
package com.newt.boot.start.utils;

import com.alibaba.fastjson.JSONObject;
import com.newt.boot.start.interceptor.RestTemplateTraceIdInterceptor;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;



import org.springframework.web.client.RestTemplate;

/**
 * RestTemplate工具类
 *
 * @version 1.0
 * @Date 2020/03/19 16:11
 */

import org.springframework.web.client.RestTemplate;

public class RestTemplateUtil {
    private static RestTemplate restTemplate = new RestTemplate();


/**
     * GET请求
     *
     * @param url 请求地址
     * @return
     */

    public static String doGet(String url) {
        restTemplate.setInterceptors(Arrays.asList(new RestTemplateTraceIdInterceptor()));
        return JSONObject.toJSONString(restTemplate.getForObject(url, String.class));
    }
}

