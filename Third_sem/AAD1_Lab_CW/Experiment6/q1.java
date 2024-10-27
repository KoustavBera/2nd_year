/* 
	* linear search without recursion O(n)
 */

import java.util.Scanner;

/**
	* q2
	*/
public class q1 {

	public static boolean linearSearch(int[] arr,int target){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==target){
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter "+n+" array elements");
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter which element you wanna search");
		int t = sc.nextInt();
		if(linearSearch(arr, t)){
			System.out.println("Success!");
		}
		else{
			System.out.println("Unsuccess!");
		}
	}
}