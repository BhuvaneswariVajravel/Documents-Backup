package com.array;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ArraySum {
public static void main(String[] args) {
	int[] arr = { 2, 5, 2 };
	arraySum(arr);
}
public static void arraySum(int arr[]) {
	Map<Integer,List<List<Integer>>> hm = new HashMap<>();
	
	List<List<Integer>> list = null;
	int count = 0;
	for(int i=0;i<=arr.length-1;i++) {
		for(int j=i+1;j<=arr.length-1;j++) {
		List<Integer> arrs= null;
		int sum= arr[i]+ arr[j];
		if(hm.containsKey(sum)) {
		count ++;
		arrs= new LinkedList<>();
		arrs.add(arr[i]);
		arrs.add(arr[j]);
		list = hm.get(sum);
		list.add(arrs);
		hm.put(sum, list);
		}else {
			list = new LinkedList<>();
		    arrs= new LinkedList<>();
			arrs.add(arr[i]);
			arrs.add(arr[j]);
			list.add(arrs);
			hm.put(sum, list);
		}
	}
	}
	System.out.println("output::"+hm);
	System.out.println("matching::"+count);
}
}
