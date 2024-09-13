package Third_sem.AAD1_Lab_CW.Experiment2;

import java.util.Scanner;

// Write to nth fibonacci number using iteration
public class problem5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
      int n = sc.nextInt();
		int[] arr=new int[n];
		
	    arr[0]=0;
		 arr[1]=1;
      for(int i=2;i<n;i++){
			arr[i]=arr[i-1]+arr[i-2];
		}
		System.out.println("nth fibonaacci no is "+arr[n-1]);
	}
}
