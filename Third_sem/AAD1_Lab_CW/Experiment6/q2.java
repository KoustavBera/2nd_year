/* 
	* linear search with recursion O(n)
 */

	import java.util.Scanner;

	/**
		* q1
		*/
	public class q2 {
	
		public static boolean linearSearch(int[] arr,int n,int target){
			if(n<0){
				return false;
			}
			return linearSearch(arr, n-1, target) || arr[n]==target;
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
			if(linearSearch(arr,n-1, t)){
				System.out.println("Success!");
			}
			else{
				System.out.println("Unsuccess!");
			}
		}
	}
