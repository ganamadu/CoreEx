package com.spring.primary;

public class AdminUser implements User {

	@Override
	public void doSomething() {
		System.out.println("Inside doSomething method in Admin User...");
	}

}
