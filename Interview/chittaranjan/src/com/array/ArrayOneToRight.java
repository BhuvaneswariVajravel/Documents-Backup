package com.array;

import java.util.Arrays;

public class ArrayOneToRight {
	public static void main(String[] args) {
		int[] A = { 6, 1, 8, 2, 3, 1, 4, 1, 1 };
		 
        reorder(A);
        System.out.println(Arrays.toString(A));
	}
	public static void reorder(int arr[]) {
		int current = 0;
		for(int i = 0; i<=arr.length-1; i++) {
			if(arr[i] != 1) {
			arr[current] = arr[i];
			current ++;
			}
		}
		System.out.println(current);
		for(int j=current;j<=arr.length-1;j++) {
			arr[j] = 1;
		}
	}
}
