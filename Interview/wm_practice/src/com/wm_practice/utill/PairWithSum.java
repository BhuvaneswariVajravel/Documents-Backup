package com.wm_practice.utill;

import java.util.HashSet;
import java.util.Set;

/*
 * Program: Find pair of of elements in Array with given sum
 * 
 * Agorithom :  add the integer in hashset while traversing
 * each time check whether the ( sum - integer ) available in set or not  
 * 
 *Time Complexity: O(n). 
 * As the whole array is needed to be traversed only once.
 *
 *Auxiliary Space: O(n). 
 *A hash map has been used to store array elements.
 * 
 * Notes:
 * 
 */

public class PairWithSum {
	public static void printpairs(int arr[], int n) {

		Set<Integer> set = new HashSet<>();
		 System.out.println(
                 "Pair with given sum "
                 + n + " is ");
		for(int i=0;i<arr.length;i++) {
			int r = n - arr[i];
			if(set.contains(r)) {
				System.out.println("( "+r+" , "+arr[i]+" )");
			}
			set.add(arr[i]);
		}

	}

	public static void main(String[] args) {

		int arr[] = { 1, 4, 2, 6, 10, 3 };
		int n = 5;
		printpairs(arr, n);
	}
}
