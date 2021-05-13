package com.core.core;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class HighestFreqString {
	
	public static void main(String[] args) {
		
		String str = "XYZ is employee of ABC company, XYZ is from blore, XYZ is ex-employee of AAA company.";
		Map<String, Long>freqStrMap =   Arrays.asList(str.split(" ")).stream().collect(Collectors.groupingBy(s->s, Collectors.counting()));
		System.out.println(freqStrMap);
	}

}
