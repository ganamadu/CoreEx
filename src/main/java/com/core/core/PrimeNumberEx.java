package com.core.core;

import java.util.stream.IntStream;

public class PrimeNumberEx {

	public static boolean isPrime(int num) {
		return !IntStream.rangeClosed(2, num/2).anyMatch(i->num%i==0);
	}



	public static void main(String args[]) {
		for(int i=2; i<=100; i++) {
			if(isPrime(i)) {
				System.out.print(" "+i);
			}
		}
		System.out.println();
		
		int j=1;
		for(int i=2; i<=100; i++) {
			if(isPrime(i)) {
				if(j%2!=0) {
					System.out.print(" "+i);
				}
				j++;
			}
		}
		
		System.out.println();
		System.out.println(IntStream.rangeClosed(1, 9).map(i->i).sum());
	}
}
