package Third_sem.AAD1_Lab_CW.Experiment2;

import java.util.Scanner;

/*  
 * //! Wap  to find smallest positive missing number
 * 
 */

/**
 * problem2
 */
public class problem2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();

		int arr[] = new int[n];

      System.out.println("Enter "+n+" numbers");

		for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();

		smallestMissingNumber(arr);
		optimisedSmallestMissing(arr);
 		sc.close();
	}
   private static int max(int[] arr){
		int max = arr[0];
		for(int i=1;i<arr.length;i++){
       max=Math.max(max, arr[i]);
		}
		return max;
	}
	private static void smallestMissingNumber(int[] arr) {
		int max=max(arr);
	   int flag=0;
		for(int i=1;i<=max;i++){
			flag=0;
			//find if i is present in the array or not using flag
			for(int j=0;j<arr.length;j++){
				if(arr[j]>0 && arr[j]==i){
					flag=1;
					break;// move to next element
				}
			}
			//after checking if flag is still 0 then i must not be present in the array
			if(flag == 0){
				System.out.println("smallest positive missing number is "+i);
				return;
			}
		}
	}
	//this approach is easy to understand yet this carries time complexity of O(n) the whole process can be carried out in O(n) using a boolean array
	public static void optimisedSmallestMissing(int[] arr){
		int max=max(arr);
		boolean isPresent[]=new boolean[max+1];
		for(int num: arr){
			if(num>0){
			isPresent[num] =true;
			}
		}
	
		for(int i=0;i<max;i++){
if(isPresent[i]==false){
	if(i>0)
	System.out.println("smallest positive missing number is "+i);

}

		}
		
	}
}
