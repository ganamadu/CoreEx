package com.core.core;

import java.time.Duration;
import java.time.LocalDate;

public class TwoDaysDifferenceEx {
	
	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		LocalDate sameDayNextMonth = LocalDate.now().plusMonths(1);
		
		Duration duration = Duration.between(today.atStartOfDay(), sameDayNextMonth.atStartOfDay());
		System.out.println(duration.toDays());
	}

}
