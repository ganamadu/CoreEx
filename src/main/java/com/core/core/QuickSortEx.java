package com.core.core;

import java.util.Arrays;

public class QuickSortEx {
	
	public static void quickSort(int[] intArr) {
		
		int low = 0;
		int high = intArr.length - 1;
		sort(intArr, low, high);
	}
	
	public static void sort(int[] intArr, int low, int high) {
		
		if(intArr == null || intArr.length == 0)
			return;
		
		if(low >= high)
			return;
		
		int mid = low+(high-low)/2;
		int pivot = intArr[mid];
		System.out.println("Pivot: "+pivot);
		int i=low, j=high;
		
		while(i <= j) {
			
			while(intArr[i] < pivot) {
				i++;
			}
			
			while(intArr[j] > pivot) {
				j--;
			}
			
			if(i <= j) {
				int temp = intArr[i];
				intArr[i] = intArr[j];
				intArr[j] = temp;
				i++;
				j--;
			}
		}
		
		if(low < j) {
			System.out.println(Arrays.toString(intArr));
			sort(intArr, low, j);
		}
		
		if(high > i) {
			System.out.println(Arrays.toString(intArr));
			sort(intArr, i, high);
		}
		
	}
	
	
	public static void main(String args[]) {
		
		int[] intArr = {3,7,5,2,8,4,6,1};
		quickSort(intArr);
		System.out.println(Arrays.toString(intArr));
	}

}
