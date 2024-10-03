package Third_sem.AAD1_Lab_CW.Experiment4;

import java.util.Scanner;

public class problem2 {
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
		System.out.println("*Selection Sort*");
		System.out.println("Before: ");
		printArray(backup);
      selectionSort(arr);
 		System.out.println("After: ");
		printArray(arr);

	}

	private static void selectionSort(int[] arr) {
	for(int i=0;i<arr.length; i++){
		int minIndex = i;
		for(int j=i+1; j<arr.length; j++){
			if(arr[j]<arr[minIndex]){
			minIndex = j;
			}
		}
		if(minIndex!=i){
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}

	}


	private static void printArray(int[] arr) {
		for(int i:arr){
			System.out.print(i+" ");
		}
		System.out.println();
}
}
