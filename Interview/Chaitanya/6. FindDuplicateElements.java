package com.sample.duplicate.elements;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateElements {
	public static void main(String[] args) {
		String[] elements = {"Amazon", "Azure","GCP", "Azure","GCP","IBM Cloud", "VMWare","Alia Baba"};
		//1. brute force
		System.out.println("************Brute Force********");
		for(int i=0;i<elements.length;i++) {
			for(int j=i+1;j<elements.length;j++) {
				if(elements[i].equals(elements[j])) {
					System.out.println(elements[i]);
				}
			}
		}
		//time complexity nsquare 
		
		//2. HashSet
		System.out.println("************HashSet********");
		Set<String> data = new HashSet<String>();
		for(String s:elements) {
			if(data.add(s)==false) {
				System.out.println(s);
			}
		}
		
		
		
		//3. HashMap<K,V>
		System.out.println("************HashMap********");
		Map<String, Integer> mapData = new HashMap<String, Integer>();
		for(String e:elements) {
			Integer count = mapData.get(e);
			if(count==null) {
				mapData.put(e, 1);
			}else {
				mapData.put(e, ++count);
			}
		}
		
		Set<Entry<String, Integer>> entrySet = mapData.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey());
			}
		}
		
		//4. Steams with set
		System.out.println("************Streams with set********");
		Set<String> streamSet = new HashSet<String>();
		Set<String> dupElements = Arrays.asList(elements).stream()
											.filter(e->!streamSet.add(e))
												.collect(Collectors.toSet());
		System.out.println(dupElements);
		
		//5. Steams with group by
		System.out.println("************Streams with group by********");
		Set<String> groupBySetDupElements = Arrays.asList(elements).stream()
										.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
										    .entrySet()
										    	.stream()
										    		.filter(e-> e.getValue()>1)
										    			.map(Map.Entry::getKey)
										    				.collect(Collectors.toSet());
		System.out.println(groupBySetDupElements);
		
		//5. Steams with frequency
		System.out.println("************Streams with Frequency********");
		List<String> list = Arrays.asList(elements);
		Set<String> freqDupElements = Arrays.asList(elements).stream().filter(e->Collections.frequency(list, e)>1)
										.collect(Collectors.toSet());
		
		System.out.println(freqDupElements);
	}
}
