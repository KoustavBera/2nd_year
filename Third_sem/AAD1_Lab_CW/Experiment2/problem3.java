package Third_sem.AAD1_Lab_CW.Experiment2;

import java.util.Scanner;

// WAP to display maximum minimum array
/* 
 * 
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
		int max=0,min=0;
		for(int i=0;i<n;i+=2){
			if(i%2 == 0){
				//max
				for (int j=0;j<arr.length;j++) {
					max=Math.max(max,arr[i]);
				}
			}
			}
			
		System.out.println("Array");
		for (int i : arr) {
			System.out.print(i);
		}
	}
}
