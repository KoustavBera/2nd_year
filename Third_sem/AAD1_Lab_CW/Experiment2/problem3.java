package Third_sem.AAD1_Lab_CW.Experiment2;

import java.util.Scanner;

// WAP to display maximum minimum array

/* 
 * the intuition is to sort the array in ascending order and then to create array and
 * manipulate array elements as we want...one problem with this approach is its time and space
 * complexity 
 */
public class problem3 {
	public static void main(String[] args) {
		System.out.println("Enter the size of array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int[] ans=new int[n];
		System.out.println("Now, enter array elements");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
	   
		 ans = minmaxArray(arr,ans);
		for(int i=0;i<ans.length;i++){
			System.out.print(ans[i]+" ");
		}
}

public static int[] minmaxArray(int[] arr, int[] ans) {
	// Apply bubble sort
	for (int i = 0; i < arr.length; i++) {
		 for (int j = 0; j < arr.length - i - 1; j++) {
			  if (arr[j] > arr[j + 1]) {
					// Swap arr[j] and arr[j + 1]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
			  }
		 }
	}

	int max = arr.length - 1;  // Initialize max correctly
	int min = 0;  // Min starts at 0

	// Create min-max array
	for (int i = 0; i < arr.length; i++) {
		 if (i % 2 == 0) {
			  ans[i] = arr[max];  // Take max value in even index
			  max--;
		 } else {
			  ans[i] = arr[min];  // Take min value in odd index
			  min++;
		 }
	}
	return ans;
}
}