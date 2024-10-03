package Third_sem.AAD1_Lab_CW.Experiment4;

import java.util.Scanner;

/**
 * problem1
 */
public class problem1 {

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
		System.out.println("*Bubble Sort*");
		System.out.println("Before: ");
		printArray(backup);
      bubbleSort(arr);
 		System.out.println("After: ");
		printArray(arr);

	}

	private static void bubbleSort(int[] arr) {
	for(int i=0;i<arr.length; i++){
		for(int j=0; j<arr.length-i-1; j++){
			//swap
			if(arr[j]>arr[j+1]){
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
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