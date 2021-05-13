package com.core.linkAssesment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Test7 {
	
	public static void main(String[] args) {
		
		List list = new ArrayList<>();
		list.add("Gana");
		list.add(10);
		
		list.forEach(System.out::println);
		
		System.out.println(list.get(0) instanceof Object);
		System.out.println(list.get(1) instanceof Integer);
		
		//Another Test
		List<String> strList = new ArrayList<>();
		strList.add("Srilatha");
		strList.add("Gana");
		strList.add("Thanni");
		strList.add("Rishi");
		
		System.out.println(strList);
		//strList.sort(Comparator.comparing(String::toString)); //Working
		//strList.stream().sorted((s1,s2)->s1.conmpareTo(s2)).collect(Collectors.toList());//Not Working  Compile time error
		//strList.sort(List.DESCENDING); //NOT Working Compile time error
		
		//Another Test
		
		LinkedList<Integer> lList = new LinkedList<>();
		lList.add(5);
		lList.add(1);
		lList.add(10);
		System.out.println(lList); //Result: [5, 1, 10]
	}

}
