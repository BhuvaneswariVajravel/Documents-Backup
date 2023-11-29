package com.sample.numbers.least.occurences;

import java.util.Arrays;

public class NumberWithLeastOccurences {
	
	public static void main(String[] args) {
		int[] number = {2,4,6,3,5,1,8,7,9,2,3,7,6,2,3,1};
		int[] sortedArr = new int[number.length];
		//Arrays.sort(number);
		for(int i=0;i<number.length;i++) {
			for(int j=i+1;j<number.length;j++) {
				int temp=0;
				if(number[i]>number[j]) {
					temp = number[i];
					number[i]=number[j];
					number[j]=temp;
				}
			}
			sortedArr[i]=number[i];
			//System.out.print(number[i]+" ");
		}
		System.out.print("sorted array : ");
		for(int i=0;i<sortedArr.length;i++) {
			System.out.print(" "+sortedArr[i]);
		}
		
		System.out.println(" Least frequently accured : "+leastFrequent(sortedArr, sortedArr.length));
	}
	
	 static int leastFrequent(int arr[], int n)
	    {
	         
	        // Sort the array
	        //Arrays.sort(arr);
	     
	        // find the min frequency using
	        // linear traversal
	        int min_count = n+1, res = -1;
	        int curr_count = 1;
	         
	        for (int i = 1; i < n; i++) {
	            if (arr[i] == arr[i - 1])
	                curr_count++;
	            else {
	                if (curr_count < min_count) {
	                    min_count = curr_count;
	                    res = arr[i - 1];
	                }
	                 
	                curr_count = 1;
	            }
	        }
	     
	        // If last element is least frequent
	        if (curr_count < min_count)
	        {
	            min_count = curr_count;
	            res = arr[n - 1];
	        }
	     
	        return res;
	    }
	

}
