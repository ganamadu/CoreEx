package com.core.linkAssesment;

public class Test3 {
	
	static int count = 0;
	public static void main(String[] args) {
		//This program is recursive method..//Hellow World! print 3 times
		if(count < 10) {
			count++;
			main(null);
		} else {
			return;
		}
		
		System.out.println("Hello World!");
	}

}
