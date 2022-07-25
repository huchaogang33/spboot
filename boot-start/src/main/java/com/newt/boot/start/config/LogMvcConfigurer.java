package com.newt.boot.start.config;

import com.newt.boot.start.config.interceptor.MdcLogInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class LogMvcConfigurer implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册TestInterceptor拦截器
        registry.addInterceptor(new MdcLogInterceptor());
        WebMvcConfigurer.super.addInterceptors(registry);
    }
}
