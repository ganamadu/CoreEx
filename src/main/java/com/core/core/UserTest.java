package com.core.core;

import java.util.Random;

public class UserTest {
	
	public static void main(String args[]) {
		Random random = new Random();
		for(int i=1;i<=500; i++) {
			
			System.out.println("User"+i+",user"+i+"@gmail.com,"+(random.nextInt(70)+10));
		}
		
	}

}
