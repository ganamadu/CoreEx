package com.core.core;

import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableAndFutureEx {
	
	public static void main(String args[]) {
		
		ExecutorService executorService = Executors.newFixedThreadPool(8);
		Queue<Future<String>> furtures = new ConcurrentLinkedQueue<>();
		
		Callable<String> task1 = () -> {
			Thread.sleep(2000);
			return "Result of Task1.....";
		};
		furtures.add(executorService.submit(task1));
		
		Callable<String> task3 = () -> {
			Thread.sleep(5000);
			return "Result of Task3.....";
		};
		furtures.add(executorService.submit(task3));
		
		Callable<String> task2 = () -> {
			Thread.sleep(1000);
			return "Result of Tash2.....";
		};
		furtures.add(executorService.submit(task2));
		
		Callable<String> task5 = () -> {
			Thread.sleep(2500);
			return "Result of Task5.....";
		};
		furtures.add(executorService.submit(task5));
		
		Callable<String> task4 = () -> {
			Thread.sleep(1500);
			return "Result of Task4.....";
		};
		furtures.add(executorService.submit(task4));
		
		
		
		Iterator<Future<String>> stringTokenFutures = furtures.iterator();
		
		while(stringTokenFutures.hasNext()) {
			try {
				System.out.println(stringTokenFutures.next().get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		executorService.shutdown();
	}

}
