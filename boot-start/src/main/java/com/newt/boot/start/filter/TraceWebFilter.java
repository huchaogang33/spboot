package com.newt.boot.start.filter;

import com.newt.boot.start.utils.TraceUtil;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * web请求链路追踪拦截器
 *
 * @create 2021-05-26 1:10 下午
 * @desc
 */
@Configuration
public class TraceWebFilter extends OncePerRequestFilter {
 
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response,
                                    javax.servlet.FilterChain filterChain) throws ServletException, IOException {
		 	TraceUtil.initTrace(request.getRequestURI());
	        filterChain.doFilter(request, response);
	        TraceUtil.clearTrace();
	}
}