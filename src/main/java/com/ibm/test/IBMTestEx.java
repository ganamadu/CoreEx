package com.ibm.test;

import java.util.HashMap;
import java.util.Map;

public class IBMTestEx {
	
	public static String getEncodeStr(String str, int k) {
		Map<Integer, Character> alphaMap = new HashMap<>();
		Map<Character, Integer> alphaSecMap = new HashMap<>();
		int i=1;
		String returnStr = "";
		for(Character c='A';c<='Z'; c++) {
			alphaMap.put(i, c);
			alphaSecMap.put(c, i);
			i++;
		}
//		System.out.println(alphaSecMap.get('A')-3);
	//	System.out.println(calDiff(alphaSecMap.get('A')-3));
		//System.out.println(('Z'-3));
		for(char c : str.toUpperCase().toCharArray()) {
			if(1>alphaSecMap.get(c)-k) {
				int diffVal = calDiff(alphaSecMap.get(c)-k);
				//System.out.println(alphaMap.get(diffVal-(-alphaSecMap.get('Z'))));
				//System.out.println("Hai.."+diffVal);
				returnStr+= alphaMap.get(diffVal-(-alphaSecMap.get('Z')));
			} else {
				returnStr+= alphaMap.get(alphaSecMap.get(c)-k);
			}
		}
		
		return returnStr;
	}
	
	
	
	public static int calDiff(int val) {
		return (0-(-val));
	}
	
	public static void main(String[] args) {
		
		System.out.println(getEncodeStr("ganapathi", 2));;
		
		
	}

}
