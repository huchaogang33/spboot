package com.newt.boot.start.utils;

import com.newt.boot.common.constants.CommonConstant;
import org.apache.commons.lang3.StringUtils;
//import org.apache.dubbo.rpc.RpcContext;
import org.slf4j.MDC;

import java.util.UUID;

public class TraceUtil {

	public final static String TRACE_ID = CommonConstant.TRACE_ID;
	public final static String TRACE_EXTENDED_INFO = "extended_info";

	public static void initTrace(String extendedInfo) {
		if (StringUtils.isBlank(MDC.get(TRACE_ID))) {
			String traceId = generateTraceId();
			setTraceId(traceId);
			MDC.put(TRACE_EXTENDED_INFO, extendedInfo);
		}
	}

/*	public static void getTraceFrom(RpcContext context) {
		String traceId = context.getAttachment(TRACE_ID);
		if (StringUtils.isNotBlank(traceId)) {
			setTraceId(traceId);
		}
		String uri = context.getAttachment(TRACE_EXTENDED_INFO);
		if (StringUtils.isNotEmpty(uri)) {
			MDC.put(TRACE_EXTENDED_INFO, uri);
		}
	}*/

	/*public static void putTraceInto(RpcContext context) {
		String traceId = MDC.get(TRACE_ID);
		if (StringUtils.isNotBlank(traceId)) {
			context.setAttachment(TRACE_ID, traceId);
		}

		String uri = MDC.get(TRACE_EXTENDED_INFO);
		if (StringUtils.isNotBlank(uri)) {
			context.setAttachment(TRACE_EXTENDED_INFO, uri);
		}
	}*/

	public static void clearTrace() {
		MDC.clear();
	}

	private static void setTraceId(String traceId) {
		traceId = StringUtils.left(traceId, 36);
		MDC.put(TRACE_ID, traceId);
	}

	private static String generateTraceId() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
}