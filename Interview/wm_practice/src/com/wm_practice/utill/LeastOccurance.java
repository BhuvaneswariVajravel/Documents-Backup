package com.wm_practice.utill;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/*
 * Program:
 * 
 * Algorithm
 * 
 * Time Complexity
 * 
 * Auxilary Space 
 */
public class LeastOccurance {

	public static void leastFreq(int a[], int n) {

		Map<Integer, Integer> map = new LinkedHashMap<>();

		for (int i : a) {
			int key = i;
			if (map.containsKey(i))
				map.put(key, map.get(key) + 1);
			else
				map.put(key, 1);
		}

		List<Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());


		Collections.sort(list,(l1,l2)->l1.getValue().compareTo(l2.getValue()));
		
		System.out.println(list.get(0).getKey());
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 1, 3, 4, 3, 4, 4 };
		int n = arr.length;
		leastFreq(arr, n);

	}

}
