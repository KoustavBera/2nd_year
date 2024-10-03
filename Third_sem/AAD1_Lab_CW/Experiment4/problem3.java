package Third_sem.AAD1_Lab_CW.Experiment4;

import java.util.Scanner;

public class problem3 {
	public static void main(String[] args) {
		System.out.println("Enter the size of array");
		Scanner sc= new Scanner(System.in);
	
		int n = sc.nextInt();
		int [] arr = new int[n];
	   System.out.println("Enter "+n+" elements");
		for(int i=0;i< n ;i ++) {
			 arr[i] = sc.nextInt();
		}
		int[] backup =arr;
		System.out.println("*Insertion Sort*");
		System.out.println("Before: ");
		printArray(backup);
      insertionSort(arr);
 		System.out.println("After: ");
		printArray(arr);

	}

	private static void insertionSort(int[] arr) {
			int n = arr.length;
			for (int i = 1; i < n; i++) {
				 int key = arr[i];
				 int j = i - 1;
 
				 // Move elements of arr[0..i-1], that are greater than key,
				 // to one position ahead of their current position
				 while (j >= 0 && arr[j] > key) {
					  arr[j + 1] = arr[j];
					  j = j - 1;
				 }
				 arr[j + 1] = key;
			}
	}


	private static void printArray(int[] arr) {
		for(int i:arr){
			System.out.print(i+" ");
		}
		System.out.println();
}
}
