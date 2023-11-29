package com.wm_practice.utill;

/*
 * Program: Move all the 1's to the left in binary aray
 * 
 * Algorithm
 * 
 * Time Complexity : O(n)
 * 
 * Auxilary Space : O(1)
 */

public class AllOneToLeft {

	public static void pushZerosToLeft(int[] arr, int n) {
		int count=n-1;
		for(int i =n-1;i>=1;i--) {
			if(arr[i]!=1) {
				arr[count--]=arr[i];
			}
		}
		while(count>=0) 
			arr[count--]=1;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,1,1,2,2,1,3,2,1};
        int n = arr.length;
        pushZerosToLeft(arr, n);
        System.out.println("Array after pushing zeros to the left: ");
        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
	}

}
