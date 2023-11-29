package com.array;

import java.util.HashMap;
import java.util.Map;

public class FirstMinOccurance {

	public static void main(String[] args) {
		int arrays[] ={3,2,3,4,2,7,4,8,4,5,5,5,6};
		System.out.println("Find First number with least occurence::"+firstNonRepeating(arrays, arrays.length));

	}
	
	public static int firstNonRepeating(int a[], int n) 
    { 
        Map<Integer,Integer> ans = new HashMap<>();
        
        for(int i = 0; i < n; i++)
        {
            if(ans.containsKey(a[i]))
            {
                ans.put(a[i],ans.get(a[i])+1);
            }
            else
            {
                ans.put(a[i],1);
            }
        }
        
        for(int i = 0; i < n; i++)
        {
            if(ans.get(a[i]) == 1)
            {
                return a[i];
            }
        }
    return 0;    
    }  

}
