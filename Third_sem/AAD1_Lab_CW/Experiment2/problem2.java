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
      System.out.println("Brute Force Approch");
		smallestMissingNumber(arr);
		System.out.println();
		System.out.println("Optimised Approach");
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
	/* This approach helps us find the smallest positive missing number in the array.
   Intuition: We check every number starting from 1 up to the largest number in the array.
   
   Here's the idea: 
   - For each number between 1 and the max number in the array, we check if it's present.
   - If a number is missing (not found in the array), that's our answer since we're looking for the smallest missing positive number.
   
   To do this, we use a `flag` that tracks whether the current number is in the array. 
   If the flag remains 0 after checking the entire array for that number, it means the number is missing!
   
   Steps:
   1. Find the maximum number in the array.
   2. For each number from 1 to max, check if it's present in the array.
   3. As soon as we find a number that's missing, print it as the smallest missing positive number.
   
   This method is simple but works well for small arrays, although the time complexity is O(n^2) due to the nested loops.
*/
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
		if(flag==1){
			System.out.println("no missing integer found!");
		}
	}
	/*  the whole process can be carried out in O(n) using
	 a boolean array which initially contains all elements false.
	 Intuition is to identify all positions in which the array contains elements
	 and mark them true.
	 these position/indexes are not just indexes they are the element itself...
	 so we are basically hitting two birds with one arrow.
	 the next step is to run a for loop from 1...and print any index which is not true
	 i.e, it is an element not present in the array..that is... it's missing right? which
	 satisfies our final goal to find the smallest missing number.
	*/
	/*PS: Thanks Vidhya for pointing out the mistake ᵔᗜᵔ */
	public static void optimisedSmallestMissing(int[] arr){
		int max=max(arr);
		boolean isPresent[]=new boolean[max+1];
		for(int num: arr){
			if(num>0){
			isPresent[num] =true;
			}
		}
	
		for(int i=1;i<max;i++){
         if(isPresent[i]==false){
	      System.out.println("smallest positive missing number is "+i);
			return;
         }

		}System.out.println("no missing integer found!");
		
	}
}
