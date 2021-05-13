package com.core.impl;

public interface Inter1 {
	
	public void show();
	
	public default void message() {
		System.out.println("Inter2 method");
	}

}
