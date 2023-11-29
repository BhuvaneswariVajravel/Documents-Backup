package com.wm_practice.utill;

/*
 * Program:  reverse a string
 * 
 * Algorithm
 * 
 * Time Complexity
 * 
 * Auxilary Space 
 */
public class ReverseString {

	public void reverseByLeft(String str) {
		char[] arr = str.toCharArray();
		int left, right = 0;

		for (left = 0, right = arr.length - 1; left < right; left++, right--) {
			char temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
		}
		for (char c : arr) {
			System.out.print(c);
		}
		System.out.println();
	}

	public void reverseWithString(String str) {
		String nstr = "";
		char ch;
		 for (int i=0; i<str.length(); i++)
	      {
	        ch= str.charAt(i); 
	        nstr= ch+nstr; 
	      }
	      System.out.println("Reversed word: "+ nstr);
	}

	public static void main(String[] args) {

		String str = " Hello World";

		ReverseString rs = new ReverseString();

		rs.reverseByLeft(str);
		rs.reverseWithString(str);

	}
}
