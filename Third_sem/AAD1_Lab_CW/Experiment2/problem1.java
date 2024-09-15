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
         
		contaguousSubArray(arr);
 		sc.close();
	}

private static void contaguousSubArray(int[] arr) {
int max=0,Index=-1,j=0;
	int currLen = 0;

for(int i=1;i<arr.length;i++){
	if(arr[i]==arr[i-1]+1){
		currLen++;
		Index = j;
	}
	else{
		currLen=1;
		j=i;
	}
	max=Math.max(max, currLen);
}
	System.out.println("Length of continuous subarray is "+max);
	System.out.println("that starts from "+Index+" index");
}
}