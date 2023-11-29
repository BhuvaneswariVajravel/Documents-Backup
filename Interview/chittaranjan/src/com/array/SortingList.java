package com.array;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortingList {
	public static void main(String[] args) {
		List<Integer> lists = new LinkedList<>();
		lists.add(1);
		lists.add(2);
		lists.add(3);
		lists.add(1);
		lists.add(1);
		lists.add(4);
		lists.add(2);
		lists.add(5);
		lists.add(5);
		System.out.println("before sorting list::"+lists);
		sort(lists);
	}
public static void sort(List<Integer> list) {
	if(!list.isEmpty() && list.size()>1) {
		Map<Integer,Integer> maps = new HashMap<Integer,Integer>();
	 list.stream().forEach(input->{
		 if(maps.containsKey(maps.get(input))) {
			 maps.put(input, maps.get(input)+1);
		 }else {
			 maps.put(input,1); 
		 }
		 
	 });
	 System.out.println("unsorted list :"+maps);
	 LinkedHashMap<Integer,Integer> sortMap = maps.entrySet().stream().sorted(Map.Entry.<Integer,Integer>comparingByValue().reversed()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2)->e1,LinkedHashMap::new));
	 System.out.println("sorted map :"+sortMap);
	 List<Integer> listSorted = new LinkedList<>();
	 for(Map.Entry<Integer, Integer> entry:sortMap.entrySet()) {
		int frequency = entry.getValue();
		while(frequency>=1) {
			listSorted.add(entry.getKey());
			frequency--;
		}
	 }
	 System.out.println("sorted list :"+listSorted);
	}else {
		System.out.println("list is sort:"+list);
	}
}
}
