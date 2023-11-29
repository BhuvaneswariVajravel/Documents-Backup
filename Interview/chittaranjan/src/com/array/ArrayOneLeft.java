package com.array;

import java.util.Arrays;

public class ArrayOneLeft {
	
		public static void main(String[] args) {
			int[] arr = { 6, 1, 8, 2, 3, 1, 4, 1, 1 };
			 
	        reorder(arr);
	        System.out.println(Arrays.toString(arr));
		}
		public static void reorder(int arr[]) {
			int current = arr.length-1;
			for(int i = current; i>=0; i--) {
				if(arr[i] != 1) {
				arr[current] = arr[i];
				current --;
				}
			}
			for(int j=current;j>=0;j--) {
				arr[j] = 1;
			}
		}
}
