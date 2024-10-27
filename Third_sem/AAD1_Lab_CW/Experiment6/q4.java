/* 
	* Binary search with recursion O(log n)
 */

	import java.util.Scanner;

	/**
		* q4
		*/
	public class q4 {
	
		public static boolean binarySearch(int[] arr,int target,int l,int r){
	 if(l>r) return false;
		int midIndex = (r+l)/2;
		if(arr[midIndex]== target) return true;
		return arr[midIndex]>target? binarySearch(arr, target, l, midIndex-1) : binarySearch(arr, target, midIndex+1, r);
		}
		public static void main(String[] args) {
			System.out.println("Enter the size of array");
			Scanner sc = new Scanner(System.in);
			int n= sc.nextInt();
			int[] arr = new int[n];
			System.out.println("Enter "+n+" array elements in sorted manner");
			for(int i=0;i<n;i++){
				arr[i] = sc.nextInt();
			}
			System.out.println("Enter which element you wanna search");
			int t = sc.nextInt();
			if(binarySearch(arr, t,0,n-1)){
				System.out.println("Success!");
			}
			else{
				System.out.println("Unsuccess!");
			}
		}
	}
