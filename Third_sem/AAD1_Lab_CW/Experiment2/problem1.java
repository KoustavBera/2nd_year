package Third_sem.AAD1_Lab_CW.Experiment2;

import java.util.Scanner;

/**
 * problem1: Contagious subarray
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
		if (currLen > maxLength) {
			 maxLength = currLen;
			 maxStartIndex = startIndex;
		}

		System.out.println("Length of contiguous subarray is " + maxLength);
		System.out.println("The subarray starts from index " + maxStartIndex);
  }
}
