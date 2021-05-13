package com.core.core;

public class ReverseStringWords {
	
	public static String strRev(String str) {
		if(str.length()<=1)
			return str;
		return strRev(str.substring(1))+str.charAt(0);
	}
	
	public static String revWord(String str) {
		String word = "";
		for(int i=str.length()-1; i>=0; i--) {
			word +=str.charAt(i);
		}
		word +=" ";
		return word;
	}
	
	
	public static void main(String args[]) {
		
		String str = "Welcome to the JavaProgramTo.com blog";
		String revStr = "";
		String revWord="";
		System.out.println(str);
		for(String word: str.split(" ")) {
			revStr += strRev(word)+" ";
			revWord += revWord(word);
		}
		System.out.println(revStr);
		System.out.println(revWord);
	}

}
