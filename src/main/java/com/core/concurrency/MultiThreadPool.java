package com.core.concurrency;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MultiThreadPool {

	private MultiThreadPool() {};

	class CustomerThreadPool extends ThreadPoolExecutor {

		public CustomerThreadPool(int corePoolSize, 
				int maximumPoolSize, 
				long keepAliveTime, TimeUnit unit,
				BlockingQueue<Runnable> workQueue) {
			super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue);
		}
	}
	
	private ExecutorService executorService = new CustomerThreadPool(600, 1200, 7, 
			TimeUnit.DAYS, 
			new ArrayBlockingQueue<Runnable>(100));

	public Future<Object> getFutureReference(Callable<Object> c) {
		return executorService.submit(c);
	}
	
	private static MultiThreadPool instance = new MultiThreadPool();
	
	public static MultiThreadPool getInstance() {
		return instance;
	}

}
