package com.core.core;

import java.util.Random;
import java.util.stream.IntStream;

public class RandomNumberEx {
	
	public static void main(String[] args) {
		
		 Random rand = new Random();
         for(int i=0;i<100;i++){    //10 random numbers
         int random=rand.nextInt(70)+20; //generates random no. between 10 and 100
         System.out.println(random);
         }
         
         IntStream.rangeClosed(20, 100);
		
	}

}
