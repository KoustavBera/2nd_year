/* 
	* Binary search without recursion O(log n)
 */

	import java.util.Scanner;

	/**
		* q3
		*/
	public class q3 {
	
		public static boolean binarySearch(int[] arr,int target,int l,int r){
		while(l<=r){
			int midIndex = (r+l)/2;
			if(arr[midIndex]==target) return true;
			else if(target<arr[midIndex]){
				r=midIndex-1;
			}
			else{
				l=midIndex+1;
			}
		}
		return false;
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