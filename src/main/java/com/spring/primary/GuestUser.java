package com.spring.primary;

public class GuestUser implements User {

	@Override
	public void doSomething() {
		System.out.println("Inside doSomething method in Gust User...");
	}

}
