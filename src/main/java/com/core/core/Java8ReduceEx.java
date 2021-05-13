package com.core.core;

import java.util.Arrays;

public class Java8ReduceEx {
	
	public static void main(String args[]) {
		
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int sum = Arrays.stream(numbers).reduce(0,(a,b)->a+b);
		System.out.println("Integer Sum: "+sum);
	}

}
