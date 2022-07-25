/*
package com.newt.boot.web.util;

import com.alibaba.fastjson.JSON;

import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

*/
/**
 * @Title:  LimitFlowAop.java   
 * @Package com.newland.receipt.mchs.config   
 * @Description:    描述   
 * @author: Qiguowen     
 * @date:   2022年4月11日 下午4:04:37   
 * @Copyright: 
 *//*

@Aspect
@Component
public class LimitFlowAop {
    private static final Logger logger = LoggerFactory.getLogger(LogDefine.CONTROLLER_DETAIL);

	@Autowired
	private StringRedisTemplate redisTemplate;
	 
	    @Around("@annotation(com.newland.receipt.mchs.web.util.Limit)")
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		Method method = signature.getMethod();
		// 拿limit的注解 Limit limit = method.getAnnotation(Limit.class);
		String methodName = method.getName();
		Object target = joinPoint.getTarget();
		String className = target.getClass().getSimpleName();
		Object[] args = joinPoint.getArgs();
		BaseRequest requestInfo = (BaseRequest) args[0];
		String leftPop = "";
		String keyName = className + "_" + methodName;
		// 类名称_方法名称 例如 Tradecontroller_list
		leftPop = redisTemplate.opsForList().leftPop(keyName);
		if (StringUtils.isEmpty(leftPop)) {
			return BaseResponseBuilder.fail(requestInfo, ErrorCodeEnum.FLLOW_LIMIT_ERROR);
		}
		logger.info("切面限流弹出元素："+leftPop);
		BaseResponse responseInfo = new BaseResponse();
		return getObject(joinPoint, requestInfo, responseInfo, leftPop,keyName);
	}
	    
	private Object getObject(ProceedingJoinPoint pjp, BaseRequest requestInfo, BaseResponse responseInfo,
			String leftPop, String keyName) throws Throwable {
		try {
			Object result = pjp.proceed();
			logger.info("返回前端原始报文信息:{}", JSON.toJSONString(result));
			return result;
		} catch (Exception e) {
			logger.error("请求流水号:{},交易异常:{}", requestInfo.getSrcSerialNo(), e);
			responseInfo.setRespMsg("交易异常,请联系管理员");
			responseInfo.setSuccess("N");
			responseInfo.setRespCode("1000");
			return responseInfo;
		} finally {
			// 要释放令牌
			//if (limit != null) {
			logger.info("切面限流加入元素："+leftPop);
				redisTemplate.opsForList().rightPush(keyName, leftPop);
			//}
		}
	}
}
*/
