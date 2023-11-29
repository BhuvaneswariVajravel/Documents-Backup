package com.wm_practice.utill;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * Program:Find the first duplicate in array
 * 
 * Algorithm
 * 
 * Time Complexity : O(n)
 * 
 * Auxilary Space :O(n)
 */
public class FirstDuplicate {
	public static void findDuplicate(int a[], int n) {

		Set<Integer> set = new HashSet<>();
		int min = -1;
		for (int i = a.length - 1; i >= 0; i--) {
			if (set.contains(a[i]))
				min = i;
			else
				set.add(a[i]);
		}

		if (min == -1)
			System.out.println("==there is no duplicate===");
		else
			System.out.println("===first occured duplicate is ====" + a[min]);

	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 2, 1, 3, 4, 3, 4, 4 };
		int n = arr.length;
		findDuplicate(arr, n);

	}
}
