package com.array;
import java.util.*;
public class ArraySumPair {
	
	


	// Returns number of pairs in arr[0..n-1] with sum equal
	// to 'sum'
	 public static List<List<Integer>> findSum(Integer array[], int sum) {
         Set<Integer> set = new HashSet<Integer>();
         List<List<Integer>> pairs = new ArrayList<>(); 
        for (Integer element : array) {
               if (set.contains(element)) {
                    List<Integer> pair = new ArrayList<Integer>();
                    pair.add(element);
                    pair.add((sum - element));
                    pairs.add(pair);
               } else {
                   set.add(sum - element);
               }
          }
         return pairs;
     }
	 
	 // 2nd approach
	 
	 public static List<List<Integer>> findPairSum(Integer array[], int sum) {
         List<List<Integer>> pairs = new ArrayList<>();
         Arrays.sort(array); // sort the element.
         int left = 0;
         int right = array.length - 1;
        while (left < right) {
          if (array[left] + array[right] == sum) {
              List<Integer> pair = new ArrayList<Integer>();
                 pair.add(array[left]);
                 pair.add(array[right]);
                pairs.add(pair); // store the pair into the list
                left++;
                right--;
           } else if (array[left] + array[right] < sum) {
                left++;
           } else {
                right--;
              }
        }
return pairs;
}

	public static void main(String args[]){
        int sum  = 10;
        Integer array[] = new Integer[] {2,4,6,1,3,7,8,2,1,9, 15, -5,22,-12};
        List<List<Integer>> pairs = findSum(array, sum);
        System.out.println(pairs);
        List<List<Integer>> ndPairs = findPairSum(array, sum);
        System.out.println(ndPairs);
  }
	

}
