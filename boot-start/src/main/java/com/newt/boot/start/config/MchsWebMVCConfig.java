package com.newt.boot.start.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MchsWebMVCConfig extends WebMvcConfigurerAdapter {
	 @Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		 System.out.println("==========静态资源拦截！============");
	      //将所有/static/** 访问都映射到classpath:/static/ 目录下
	     //registry.addResourceHandler("/static/**/").addResourceLocations("classpath:/static/");
		 registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
		 registry.addResourceHandler("/resources/**").addResourceLocations("classpath:/resources/");

	    
	}
	 
	 @Override
	public void addCorsMappings(CorsRegistry registry) {
		 registry.addMapping("/**")
	        .allowedHeaders("*")
	        .allowedMethods("POST","GET","PUT", "DELETE")
	        .allowedOrigins("*");
	}
}
