package com.sample.sample1;

import java.util.Stack;

//reverse a string without disturbing special characters
public class ReverseString {
	   public static String reverseOnlyLetters(String S) {
	        Stack<Character> letters = new Stack<Character>();
	        for (char c: S.toCharArray())
	            if (Character.isLetter(c))
	                letters.push(c);

	        StringBuilder ans = new StringBuilder();
	        for (char c: S.toCharArray()) {
	            if (Character.isLetter(c))
	                ans.append(letters.pop());
	            else
	                ans.append(c);
	        }

	        return ans.toString();
	    }
	    
	    public static void main(String args[]) {
	    	String s = "Chait##Bho@HSBC-HYD";
	    	System.out.println(s);
	    	System.out.println(reverseOnlyLetters(s));
	    }

}
