package com.core.concurrency;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class TaskExecutionWebServer {
	
	public static final int NTHREADS = 15;
	
	public static final Executor exec = Executors.newFixedThreadPool(NTHREADS);
	
	public static int count=0;
	
	public static void disp() {
		System.out.println("Hello Word!.....");
	}
	
	public static void main(String args[]) {
		
		 while(true) {
			 Runnable task = new Runnable() {
				@Override
				public void run() {
					disp();
				}
			};
			
			if(count < 100) {
				 count++;
			 } else {
				 break;
			 }
			exec.execute(task);
		 }
	}

}
