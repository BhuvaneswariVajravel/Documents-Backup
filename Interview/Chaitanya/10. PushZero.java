package com.sample.strings;

class PushZero {
	// Function which pushes all zeros to end of an array.
	static void pushZerosToEnd(int arr[], int n) {
		int count = 0; // Count of non-zero elements

		// Traverse the array. If element encountered is
		// non-zero, then replace the element at index 'count'
		// with this element
		for (int i = 0; i < n; i++)
			if (arr[i] != 0)
				arr[count++] = arr[i]; // here count is
										// incremented

		// Now all non-zero elements have been shifted to
		// front and 'count' is set as index of first 0.
		// Make all elements 0 from count to end.
		while (count < n)
			arr[count++] = 0;
	}

	/* Driver function to check for above functions */
	public static void main(String[] args) {
		int arr[] = { 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9 };
		int n = arr.length;
		pushZerosToEnd(arr, n);
		System.out.println("Array after pushing zeros to the back: ");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");

		pushZerosToStart(arr, n);
		System.out.println("Array after pushing zeros to the back: ");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

	private static void pushZerosToStart(int[] arr, int n) {

		// To store the count of elements
		// which are not equal to 1
		int count1 = 0;

		// Traverse the array and calculate
		// count of elements which are not 1
		for (int i = 0; i < n; i++)
			if (arr[i] != 1)
				arr[count1++] = arr[i];

		// Now all non-ones elements have been shifted to
		// front and 'count1' is set as index of first 1.
		// Make all elements 1 from count to end.
		while (count1 < n)
			arr[count1++] = 1;

		// Initialize lastNonBinary position to zero
		int lastNonOne = 0;

		// Traverse the array and pull non-zero
		// elements to the required indices
		for (int i = n - 1; i >= 0; i--) {

			// Ignore the 1's
			if (arr[i] == 1)
				continue;
			if (lastNonOne == 0) {

				// Mark the position Of
				// last NonBinary integer
				lastNonOne = i;
			}

			// Place non-zero element to
			// their required indices
			if (arr[i] != 0)
				arr[lastNonOne--] = arr[i];
		}

		// Put zeros to start of array
		while (lastNonOne >= 0)
			arr[lastNonOne--] = 0;	
	}
}