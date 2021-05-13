package com.spring.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicleService {
	
	@Autowired
	//@Qualifier("bikeBean")
	private Vehicle vehicle;
	
	public void startAndStopVehicle() {
		vehicle.start();
		vehicle.stop();
	}

}
