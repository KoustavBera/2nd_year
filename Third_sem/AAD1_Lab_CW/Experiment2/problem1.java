package Third_sem.AAD1_Lab_CW.Experiment2;

import java.util.Scanner;

/**
/**
 * Problem: Find the longest contiguous subarray where each element is exactly one more than the previous.
 * 
 * Intuition: 
 * - We want to identify the longest sequence of consecutive numbers in the array.
 * - As we traverse the array, we check if the current element continues this sequence (i.e., is equal to the previous element +1).
 * - If yes, we extend the current subarray. If no, we compare the current subarray’s length to the longest subarray found so far, and reset for a new subarray.
 * 
 * Approach:
 * 1. We start by setting two lengths: one for the longest contiguous subarray found (`maxLength`) and one for the current subarray being checked (`currLen`).
 * 2. As we loop through the array, we check if each element continues the sequence. 
 * 3. If it does, we extend the current subarray length.
 * 4. If not, we check if the current subarray is the longest one we’ve found and reset the counter to start tracking a new subarray.
 * 5. Finally, after the loop, we check if the last subarray was the longest one.
 * 
 * Time Complexity: O(n), as we are traversing the array only once.
 * 
 * Example:
 * Input: [1, 2, 3, 5, 6, 7, 8, 10]
 * Output: The longest contiguous subarray is from index 3 to 7 with a length of 4.
 */

public class problem1 {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();

		int arr[] = new int[n];

      System.out.println("Enter "+n+" numbers");

		for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
         
		contiguousSubArray(arr);
 		sc.close();
	}

	private static void contiguousSubArray(int[] arr) {

		int maxLength = 0;        // To store the length of the longest contiguous subarray
		int currLen = 1;          // Current subarray length
		int maxStartIndex = 0;    // Index where the longest subarray starts
		int startIndex = 0;       // Index where the current subarray starts

		for (int i = 1; i < arr.length; i++) {
			 // Check if the current element continues the contiguous sequence
			 if (arr[i] == arr[i - 1] + 1) {
				  currLen++;
			 } else {
				  // Check if the current subarray is the longest found so far
				  if (currLen > maxLength) {
						maxLength = currLen;
						maxStartIndex = startIndex;
				  }
				  // Reset for the new subarray
				  currLen = 1;
				  startIndex = i;
			 }
		}

		// After the loop, check if the last subarray was the longest
		/*
		 * if the current length is the new longest then update the maxStartIndex to startIndex
		 */
		if (currLen > maxLength) {
			 maxLength = currLen;
			 maxStartIndex = startIndex;
		}

		System.out.println("Length of contiguous subarray is " + maxLength);
		System.out.println("The subarray starts from index " + maxStartIndex);
  }
}
