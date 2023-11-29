package com.string;

/*Given string str consisting of uppercase and lowercase characters.
The task is to sort uppercase and lowercase characters separately such that 
if the ith place in the original string had an uppercase character,
then it should not have a lowercase character after being sorted and vice versa.*/
import java.util.Collections;
import java.util.Vector;

public class SortedStringCamelCase {

	public static void main(String[] args) {
		StringBuilder s = new StringBuilder("gEeksfOrgEEkS");
		int n = s.length();

		System.out.println(getSortedString(s, n));
	}

	public static String getSortedString(StringBuilder s, int n) {

		Vector<Character> v1 = new Vector<>();
		Vector<Character> v2 = new Vector<>();

		for (int i = 0; i < n; i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
				v1.add(s.charAt(i));

			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'z')
				v2.add(s.charAt(i));
		}

		// Sort both the vectors
		Collections.sort(v1);
		Collections.sort(v2);

		int i = 0, j = 0;

		for (int k = 0; k < n; k++) {

			// If current character is lowercase
			// then pick the lowercase character
			// from the sorted list
			if (s.charAt(k) >= 'a' && s.charAt(k) <= 'z') {
				s.setCharAt(k, v1.elementAt(i));
				++i;
			}

			// Else pick the uppercase character
			else if (s.charAt(k) >= 'A' && s.charAt(k) <= 'z') {
				s.setCharAt(k, v2.elementAt(j));
				++j;
			}
		}

		// Return the sorted string
		return s.toString();
	}

}
