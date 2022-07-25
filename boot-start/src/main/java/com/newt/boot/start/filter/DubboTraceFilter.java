/*
package com.newt.boot.start.filter;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SimplePropertyPreFilter;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.dubbo.common.extension.Activate;
import org.apache.dubbo.registry.Constants;
import org.apache.dubbo.rpc.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.InputStream;
import java.util.Arrays;

@Activate(order = 999, group = { Constants.PROVIDER_PROTOCOL, Constants.CONSUMER_PROTOCOL })
public class DubboTraceFilter implements Filter {

	private static final Logger logger = LoggerFactory.getLogger(LogDefine.SERVICE_DETAIL);

	@Override
	public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
		// 处理 Trace 信息
		printRequest(invocation);
		// 执行前
		handleTraceId();
		long start = System.currentTimeMillis();
		Result result = invoker.invoke(invocation);
		long end = System.currentTimeMillis();
		// 执行后
		final long executionTime = end - start;
		printResponse(invocation, result, executionTime);
		return result;
	}

	private void printRequest(Invocation invocation) {
		DubboRequestDTO requestDTO = new DubboRequestDTO();
		requestDTO.setInterfaceClass(invocation.getInvoker().getInterface().getName());
		requestDTO.setMethodName(invocation.getMethodName());
		requestDTO.setArgs(getArgs(invocation));
		logger.info("商户APP-RPC请求开始 , {}", requestDTO);
	}

	private void printResponse(Invocation invocation, Result result, long spendTime) {
		DubboResponseDTO responseDTO = new DubboResponseDTO();
		responseDTO.setInterfaceClassName(invocation.getInvoker().getInterface().getName());
		responseDTO.setMethodName(invocation.getMethodName());
		try {
			if(result != null) {
				SimplePropertyPreFilter filter = new SimplePropertyPreFilter();
				filter.getExcludes().add("imageData"); // 排除字段名为imageData的字段
				responseDTO.setResult(JSON.toJSONString(result.getValue(), filter));
			}
		} catch (Exception e) {
			logger.error("com.newland.receipt.mchs.filter.DubboTraceFilter异常:{}",e);
			responseDTO.setResult(ExceptionUtils.getMessage(e));
		}
		responseDTO.setSpendTime(spendTime);
		logger.info("商户APP-RPC请求结束 , {}", responseDTO);
	}

	private Object[] getArgs(Invocation invocation) {
		Object[] args = invocation.getArguments();
		args = Arrays.stream(args).filter(arg -> {
			// 过滤大参
			if (arg instanceof byte[] || arg instanceof Byte[] || arg instanceof InputStream 
					|| arg instanceof File || arg instanceof IOcrService || arg instanceof ImageFileUpDownloadRequest || arg instanceof OcrRequest) {
				return false;
			}
			return true;
		}).toArray();
		return args;
	}

	private void handleTraceId() {
		RpcContext context = RpcContext.getContext();
		if (context.isConsumerSide()) {
			TraceUtil.putTraceInto(context);
		} else if (context.isProviderSide()) {
			TraceUtil.getTraceFrom(context);
		}
	}
}*/
