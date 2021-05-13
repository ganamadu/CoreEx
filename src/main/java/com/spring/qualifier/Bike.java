package com.spring.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bikeBean")
public class Bike implements Vehicle {

	@Override
	public void start() {
		System.out.println("Bike implemented class");
	}

	@Override
	public void stop() {
		System.out.println("Bike implemented class");		
	}

}
