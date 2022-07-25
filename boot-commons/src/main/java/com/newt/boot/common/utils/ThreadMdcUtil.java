package com.newt.boot.common.utils;

import com.newt.boot.common.constants.CommonConstant;
import org.slf4j.MDC;

import java.util.Map;
import java.util.concurrent.Callable;

/**
 * 线程MDC包装类
 *
 * @author hetiantian
 * @version 1.0
 * @Date 2020/03/18 15:18
 */
public class ThreadMdcUtil {
    public static void setTraceIdIfAbsent() {
        if (MDC.get(CommonConstant.TRACE_ID) == null) {
            MDC.put(CommonConstant.TRACE_ID, TraceIdUtil.getTraceId());
        }
    }

    public static <T> Callable<T> wrap(final Callable<T> callable, final Map<String, String> context) {
        return () -> {
            if (context == null) {
                MDC.clear();
            } else {
                MDC.setContextMap(context);
            }
            setTraceIdIfAbsent();
            try {
                return callable.call();
            } finally {
                MDC.clear();
            }
        };
    }

    public static Runnable wrap(final Runnable runnable, final Map<String, String> context) {
        return new Runnable() {
            @Override
            public void run() {
                if (context == null) {
                    MDC.clear();
                } else {
                    MDC.setContextMap(context);
                }
                setTraceIdIfAbsent();
                try {
                    runnable.run();
                } finally {
                    MDC.clear();
                }
            }
        };
    }
}
