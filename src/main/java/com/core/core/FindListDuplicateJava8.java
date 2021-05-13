package com.core.core;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindListDuplicateJava8 {
	
	public static void findDuplicate(List<Integer> intList) {
		
		Map<Integer, Long> dlupEleMap = intList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(dlupEleMap);
	}
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(5, 3, 4, 1, 3, 7, 2, 9, 9, 4);
		findDuplicate(list);
		
	}

}
