package com.sample.palandrome;

import java.util.Stack;

public class Palandrome {
	
	static boolean isStringPalindrome(String s) {
		
		int i=0, j=s.length()-1;
		while (i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
	public static void main(String s[]) {
		String input = "racecar";//madam, racecar, radar
		System.out.println("is palindrome : "+ isStringPalindrome(input));
		System.out.println("is palindrome stack : "+ isPalindromeStack(input));
		
		int i=100;//101/99
		System.out.println("is palindrome : "+isNumberPalindrome(i));
	}
	
	static boolean isPalindromeStack(String s) {
			
			Stack<Character> stack =  new Stack<Character>();
			
			for(char c: s.toCharArray()) {
				stack.push(c);
			}
			
			StringBuilder sb = new StringBuilder();
			for(int i=0;i<stack.size();i++) {
				sb.append(stack.pop());
			}
			
			if(s.equals(sb.toString())) {
				return true;
			}else {
				return false;
			}	
	}

	
	static boolean isNumberPalindrome(int number) {
		
		int temp =0, y=number;
		while(number>0) {
			int x = number%10;
			number = number /10;
			temp = temp*10+x;
		}
		
		if(y==temp) {
			return true;
		}else {
			return false;
		}
	}
	
	
}
