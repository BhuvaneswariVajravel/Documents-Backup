package com.array;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		Integer[] arr = { 6, 1, 8, 2, 3, 1, 4, 6, 7 };
		 
        duplicate(arr);
	}
	public static void duplicate(Integer a[]) {
	
		LinkedHashSet<Integer> list = new LinkedHashSet<>(Arrays.stream(a).collect(Collectors.toList()));
		System.out.println("remove duplicate::"+list);
		if(a.length==1) {
			System.out.println("no duplicate:");	
		}
		System.out.println("Before Sorting:"+Arrays.toString(a));
        System.out.print ("After Sorting:");
        //sorting the elements
        //use quick sort instead of this
        for(int i=0;i<a.length;i++)
        {
            for(int j=i;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }

            }
        }
      //After sorting
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+"\t");
        }
        System.out.print("\nAfter removing duplicates:");
        int b=0;
        a[b]=a[0];
        for(int i=1;i<a.length;i++)
        {
            if (a[b]!=a[i])
            {
                b++;
                a[b]=a[i];
            }
        }
        for (int i=0;i<=b;i++ )
        {
            System.out.print(a[i]+"\t");
        }
    }
}
