package com.sample.integers.pair;

import java.util.HashMap;
import java.util.Map;
//get the index of the pair having total=6 or some input number
public class IntegerPairTarget {

	public static void main(String[] args) {
		int[] intArr =  { 1, 2, 3, 4, 5,5, 6, 7, 8, 9 }; //{57, 2, 37, 7, 5, 4, 30};//{57, 3, 37, 7, 5, 4, 30};//
		int target = 10;
		System.out.println("Match index using o(n*n): " + getPairList1(intArr, target));
		System.out.println("Match index using o(n): " + getPairList2(intArr, target));
	}

	//Time complexity is o(n*n)
	public static Map<Integer, Integer> getPairList1(int[] intArr, int target) {
		Map<Integer, Integer> matchIndexMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < intArr.length; i++) {
			for (int j = i+1; j < intArr.length; j++) {
				if (target == (intArr[i] + intArr[j])) {
					matchIndexMap.put(i, j);
				}
			}
		}
		return matchIndexMap;
	}

	//Time complexity is o(n)
	public static Map<Integer, Integer> getPairList2(int[] intArr, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		Map<Integer, Integer> matchIndexMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < intArr.length; i++) {
			if(map.containsKey(target-intArr[i])) {
				matchIndexMap.put(map.get(target-intArr[i]), i);
			}else {
				map.put(intArr[i], i);
			}
		}
		return matchIndexMap;
	}
}
