package com.spring.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {

	@Override
	@Qualifier("carBean")
	public void start() {
		System.out.println("Car implemented class");
	}

	@Override
	public void stop() {
		System.out.println("Car implemented class");
	}

}
