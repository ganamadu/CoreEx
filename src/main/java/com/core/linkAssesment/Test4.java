package com.core.linkAssesment;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Test4 {
	
	public static void main(String[] args) {
		
		String[] strArr = {"abc", "10", "2", "0"};
		
		List<String> strList = Arrays.asList(strArr);   //If comment these two lines
		Collections.sort(strList);						// Out Put: [abc, 10, 2, 0]

		System.out.println(Arrays.toString(strArr)); //If not comment abov lines Out Put: [0, 10, 2, abc]
		
		//Another Test
		HashMap<String, Integer> hMap = new HashMap();
		hMap.put("Apples", 3);
		hMap.put("Banana", 2);
		
		int count = hMap.get("Apples");
		hMap.put("Apples", count+4);
		System.out.println(hMap);
	}

}
