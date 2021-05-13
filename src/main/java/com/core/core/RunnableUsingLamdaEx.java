package com.core.core;

public class RunnableUsingLamdaEx {
	
	public static void main(String args[]) {
		
		Runnable oldRunnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("Old Thread Name: "+Thread.currentThread().getName());
			}
		};
		
		Runnable lamdaRunnable = () -> System.out.println("Thread Name: "+Thread.currentThread().getName());
		Thread oldThread = new Thread(oldRunnable);
		Thread lamdaThread = new Thread(lamdaRunnable);
		oldThread.start();
		lamdaThread.start();
	}

}
