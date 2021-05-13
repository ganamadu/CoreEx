package com.core.linkAssesment;

public class Test5 {
	
	public static void print(String message) {
		System.out.print(message);
		message+=" ";
	}
	
	public static void main(String args[]) {
		
		String message = "Hello";
		print(message);
		message+="World";
		print(message);  // Final output is: HelloHelloWorld
		
		//Another test
		int a = 1;
		int b = 0;
		//int c = a/b;
		//System.out.println(c); //It will throw Arithmetic Exception
		System.out.println();
		System.out.println(0%5 == 0); // true
		System.out.println(0%5 != 5); //true
		
		//Another test
		String testMessage = "Hello World!";
		System.out.println(testMessage.substring(6,12));
		//String newMessage = testMessage.substring(6,12) + testMessage.substring(12,6); //Exception in thread "main" java.lang.StringIndexOutOfBoundsException: begin 12, end 6, length 12
		//System.out.println(newMessage);
		
		//Another Test
		System.out.println("Apple".compareTo("Banana")); //Return negative number -1
		
	}

}
