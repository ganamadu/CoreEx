package com.core.core;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Java8FileReadEx {
	
	public static void main(String[] args) throws Exception {
		
		Files.readAllLines(Paths.get("D:\\UserData.txt")).stream().forEach(System.out::println);
		
	}

}
