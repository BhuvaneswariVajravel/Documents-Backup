package com.exercise;

//Java implementation of the above approach

class GFG1
{
		
		// Function to count the characters
		// with same adjacent characters
	
		static int countChar(String str)
		{
			int n = str.length();
		
			// if length is less than 3
			// then return length as there
			// will be only two characters
			if (n <= 2)
				return n;
			int count = 2;
		
			// Traverse the string
			for (int i = 1; i < n - 1; i++)
		
				// Increment the count if the previous
				// and next character is same
				if (str.charAt(i - 1) == str.charAt(i + 1))
					count++;
		
			// Return count
			return count;
		}
	
		// Driver code
		public static void main(String []args)
		{
			String str = "egeeksk";
			System.out.println(countChar(str));
		
		
		}
}


//This code is contributed
//by ihritik
