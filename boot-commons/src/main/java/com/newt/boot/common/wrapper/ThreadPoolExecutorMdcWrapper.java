package com.newt.boot.common.wrapper;

import com.newt.boot.common.utils.ThreadMdcUtil;
import org.slf4j.MDC;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;

/**
 *线程池包装类
 *需要对线程池和http做下封装和添加拦截器 线程池的封装：
   线程池封装类：ThreadPoolExecutorMdcWrapper.java
 * @version 1.0 刘子良 2022-04-29 优化线程池 加入 MDC
 * @Date 2022/04/29 15:29
 */
public class ThreadPoolExecutorMdcWrapper extends ThreadPoolTaskExecutor/*ThreadPoolExecutor*/ {
	/*public ThreadPoolExecutorMdcWrapper(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit,
			BlockingQueue<Runnable> workQueue) {
		super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue);
	}

	public ThreadPoolExecutorMdcWrapper(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit,
			BlockingQueue<Runnable> workQueue, ThreadFactory threadFactory) {
		super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue, threadFactory);
	}

	public ThreadPoolExecutorMdcWrapper(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit,
			BlockingQueue<Runnable> workQueue, RejectedExecutionHandler handler) {
		super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue, handler);
	}

	public ThreadPoolExecutorMdcWrapper(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit,
			BlockingQueue<Runnable> workQueue, ThreadFactory threadFactory, RejectedExecutionHandler handler) {
		super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue, threadFactory, handler);
	}

	@Override
	public void execute(Runnable task) {
		super.execute(ThreadMdcUtil.wrap(task, MDC.getCopyOfContextMap()));
	}

	@Override
	public <T> Future<T> submit(Runnable task, T result) {
		return super.submit(ThreadMdcUtil.wrap(task, MDC.getCopyOfContextMap()), result);
	}

	@Override
	public <T> Future<T> submit(Callable<T> task) {
		return super.submit(ThreadMdcUtil.wrap(task, MDC.getCopyOfContextMap()));
	}

	@Override
	public Future<?> submit(Runnable task) {
		return super.submit(ThreadMdcUtil.wrap(task, MDC.getCopyOfContextMap()));
	}*/
	
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 988848852677985501L;

	@Override
	public void execute(Runnable task) {
		super.execute(ThreadMdcUtil.wrap(task, MDC.getCopyOfContextMap()));
	}
	
	
	@Override
	public <T> Future<T> submit(Callable<T> task) {
		return super.submit(ThreadMdcUtil.wrap(task, MDC.getCopyOfContextMap()));
	}
	
	@Override
	public Future<?> submit(Runnable task) {
		return super.submit(ThreadMdcUtil.wrap(task, MDC.getCopyOfContextMap()));
	}
	
	
	@Override
	public void setCorePoolSize(int corePoolSize) {
		// TODO Auto-generated method stub
		super.setCorePoolSize(corePoolSize);
	}
	
	@Override
	public void setMaxPoolSize(int maxPoolSize) {
		// TODO Auto-generated method stub
		super.setMaxPoolSize(maxPoolSize);
	}
	
	@Override
	public void setKeepAliveSeconds(int keepAliveSeconds) {
		// TODO Auto-generated method stub
		super.setKeepAliveSeconds(keepAliveSeconds);
	}
	
	@Override
	public void setQueueCapacity(int queueCapacity) {
		// TODO Auto-generated method stub
		super.setQueueCapacity(queueCapacity);
	}
	
	@Override
	public void setRejectedExecutionHandler(RejectedExecutionHandler rejectedExecutionHandler) {
		// TODO Auto-generated method stub
		super.setRejectedExecutionHandler(rejectedExecutionHandler);
	}
	
	
}