package com.core.linkAssesment;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
	
	public static void main(String[] args) {
		
		List<Boolean> list = new ArrayList<>();
		list.add(true);
		list.add(Boolean.parseBoolean("False"));
		list.add(Boolean.TRUE);
		System.out.print(list.size());
		System.out.print(list.get(1) instanceof Boolean);
		
		//Another Test
		System.out.println(); 
		System.out.println("strawberries".substring(2,5));
		System.out.println("Ganapathi".substring(2,5));
	}

}
