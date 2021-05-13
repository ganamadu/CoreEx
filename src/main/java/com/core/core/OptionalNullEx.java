package com.core.core;

import java.util.Optional;

public class OptionalNullEx {
	
	public static void main(String args[]) {
		String str = null;
		Optional<String> strOpt = null;
		System.out.println(Optional.ofNullable(str).isPresent());
		
		
		
	}

}
