package com.newt.boot.start.config;

import com.newt.boot.start.interceptor.LogInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 拦截器配置类
 *
 * @version 1.0
 * @Date 2020/03/14 11:14
 */
//@Configuration
public class InterceptorConfig extends WebMvcConfigurerAdapter {
    //实现拦截器 要拦截的路径以及不拦截的路径
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册自定义拦截器，添加拦截路径和排除拦截路径
        registry.addInterceptor(new LogInterceptor()).addPathPatterns("/**");
    }
}
