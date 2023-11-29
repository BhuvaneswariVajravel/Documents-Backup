package com.customize.linkedlist;

public class PalindromeString {
public static void main(String[] args) {
	//boolean flag = palidrome("mom");
	boolean flag = palidromeBest("GOODBYE");
	if(flag)
	System.out.println(" String is palindrome ::");
	else
		System.out.println(" String is not palindrome::");	
}
public static boolean palidrome(String s) {
	 
	 char arr[] = s.toCharArray();
	 StringBuilder sb = new StringBuilder();
	 try {
	 for(int i= arr.length-1; i>=0; i--) {
		 sb.append(arr[i]);
	 }
	 }catch(ArrayIndexOutOfBoundsException ex) {
		System.out.println("error message::"+ex.getMessage()); 
	 }
	return sb.toString().equalsIgnoreCase(s) ? true: false ;
}
public static boolean palidromeBest(String s) {
	 
	 char arr[] = s.toCharArray();
	 int i =0; int j= s.length()-1;
	 int temp = j;
	 StringBuilder sb = new StringBuilder();
	 try {
	 while(i<=j) {
		  
		if(arr[i] !=arr[temp]) {
			sb.append(arr[temp]);
			System.out.println("output message::"+sb.toString());
			return false;
		}
		sb.append(arr[temp]);
		i++;
		temp--;
	 }
	 }catch(ArrayIndexOutOfBoundsException ex) {
		System.out.println("error message::"+ex.getMessage()); 
	 }
	 System.out.println("output message::"+sb.toString());
	return sb.toString().equalsIgnoreCase(s) ? true: false ;
}


}
