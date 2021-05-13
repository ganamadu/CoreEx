package com.core.linkAssesment;

public class ExceptionTest {
	
	public static void badMethod() {
		throw new Error();
	}
	
	public static void main(String[] args) {
		
		try {
			System.out.println("A");
			badMethod();
			System.err.println("B");
		} catch(Exception e) {
			System.out.println("C");
		} finally {
			System.out.println("D");
		}
		
	}

}
