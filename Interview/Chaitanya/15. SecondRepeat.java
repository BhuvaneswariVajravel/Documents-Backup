package com.sample.sample1;

import java.util.HashMap;
import java.util.Map;

public class SecondRepeat {

	public static void main(String[] args) {
	    int[] intArray = {6, 4, 2, 3, 4, 5,2, 8};
	    int count = 0;
	    Map<Integer, Integer> repeatCounter = new HashMap<>();
	    for (int i : intArray) {
	        if (repeatCounter.containsKey(i)) {
	            int repeatedNTimes = repeatCounter.get(i);
	            repeatCounter.put(i, repeatedNTimes + 1);
	        }else{
	            repeatCounter.put(i, 1);
	        }
	    }
	    for (int i : intArray) {
	        if (repeatCounter.get(i) == 2) {
	            count++;
	            if (count == 2) {
	                System.out.println(i);
	                break;
	            }
	        }
	    }
	}
}
