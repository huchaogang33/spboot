package com.newt.boot.start.interceptor;
/*import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.slf4j.MDC;
import com.newland.receipt.mchs.common.constants.CommonConstant;
import java.io.IOException;*/

/**
 * OKHttp 添加traceId 拦截器
 *
 * @version 1.0
 * @Date 2020/03/19 14:31
 */
/*public class OkHttpTraceIdInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        String traceId = MDC.get(CommonConstant.TRACE_ID);
        Request request = null;
        if (traceId != null) {
            //添加请求体
            request = chain.request().newBuilder().addHeader(CommonConstant.TRACE_ID, traceId).build();
        }
        Response originResponse = chain.proceed(request);

        return originResponse;
    }
}*/
