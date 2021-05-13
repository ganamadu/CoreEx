package com.spring.qualifier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class QualifierVehicleServiceTest {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.core.qualifier");
		context.refresh();
		VehicleService service = context.getBean(VehicleService.class);
		service.startAndStopVehicle();
		
		context.close();
		
	}

}
