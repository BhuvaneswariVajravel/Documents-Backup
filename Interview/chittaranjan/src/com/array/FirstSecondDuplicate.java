package com.array;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FirstSecondDuplicate {
	public static void main(String[] args) {
		Integer arr[] = {2,3,4,3,5,6,5};
		System.out.println("second duplicate::"+duplicate(arr));
		System.out.println("second duplicate using set::"+duplicate2(arr));
		
	}
	public static Integer duplicate(Integer arr[]) {
		int match =0 ;
		int secondDup=0;
		Map<Integer, Integer> map= new LinkedHashMap<>();
		Arrays.stream(arr).forEach(a->{
			if(map.containsKey(a)) {
				map.put(a, map.get(a)+1);
				
			}else {
				map.put(a, 1);	
			}
			
		});
		
		for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
			 if(entry.getValue()==2) {
				 match++;
				 if(match == 2) {
					 secondDup =  entry.getKey();
					 break ;
				 }
			}
		}
		
		System.out.println("map::"+map);
		
		return secondDup;
		
	}
	public static int duplicate2(Integer arr[]) {
		  Set<Integer>	set = new LinkedHashSet<>();
		  List<Integer>  list = new LinkedList<>();
		  Arrays.stream(arr).forEach(a->{
			 if(set.add(a)) {
				 set.add(a);
			  }else {
				  list.add(a) ;
			 }
		 });
		  System.out.println("1st and 2nd duplicate::"+list);
		  return list.get(1) ;
		  
		}
	
}
