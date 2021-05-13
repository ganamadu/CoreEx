package com.core.core;

import java.util.Arrays;

public enum EnumSingleton {

	WEEKDAY("Monday", "Tuesday", "Wednesday", "Thursday", "Friday"),
	WEEKEND("Saturday", "Sunday");

	private String[] days;

	private EnumSingleton(String ...days) {
		System.out.println("Initializing enum with " + Arrays.toString(days));
		this.days = days;
	}

	public String[] getDays() {
		return this.days;
	}

	public String toString() {
		return "EnumSingleton{" +
				"days=" + Arrays.toString(days) +
				'}';
	}
	
	public static void main(String args[]) {
		
		System.out.println(EnumSingleton.WEEKDAY);
		System.out.println(EnumSingleton.WEEKEND);
		
	}

}

