package com.core.core;

public class OverLoadEx {

	
	public void show(int a, int b) {      //Error for Duplicate method show(int, int) in type OverLoadEx
		System.out.println("a+b: "+a+b);
	}
	
	/*
	 * public int show(int a, int b) { // Duplicate method show(int, int) in type
	 * OverLoadEx return a+b; }
	 */
	
	public static void main(String args[]) {
		
		Void gana=null;
		System.out.println(gana);
		System.out.println(Void.TYPE);
		
	}
	
}
