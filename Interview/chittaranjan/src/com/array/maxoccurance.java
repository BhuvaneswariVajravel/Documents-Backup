package com.array;

import java.util.*;
import java.util.stream.Collectors;

public class maxoccurance {
    public static void main(String args[]){
        Integer arrays[] ={1,2,2,2,2,4,4,4,4,5,5,5,6};
        List<Integer> list= Arrays.asList(arrays);
        Map<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
         list.stream().forEach(a->{

         if(map.containsKey(a)) {
           map.put(a,map.get(a)+1);
         }else{
             map.put(a,1);
         }
        }

        );
       /*toMap keyMapper: a mapping function to produce keys
        valueMapper: a mapping function to produce values
        mergeFunction: a merge function, used to resolve collisions between values associated with the same key, as supplied to Map.merge(Object, Object, BiFunction)
        mapSupplier : a function which returns a new, empty Map into which the results will be inserted*/
          System.out.println("output::"+map);
        LinkedHashMap<Integer,Integer> sort = map.entrySet().stream().sorted((Map.Entry.<Integer, Integer>comparingByValue().reversed()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

/*
        Map<Integer, Integer> sortedMap =
                map.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue())
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                                (e1, e2) -> e1, LinkedHashMap::new));
*/
        System.out.println("short::"+sort);
    }
}
