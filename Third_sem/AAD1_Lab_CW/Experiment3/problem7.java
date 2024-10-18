

import java.util.Scanner;

/*  
 * to smallest positive missing number
 * Intuition: we believe our function smallestPositiveMissingNumberbyRecursion() will give
 * us the smallest positive missing number without checking the last term of the array.
 * Our task is to check the last term previous term = arr[idx] - 1 ;  then we all rely on our faith
 */
/**
 * problem7
 */
public class problem7 {

    public static void main(String[] args) {
        System.out.println("Smallest Positive missing number");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        smallestPositiveMissingNumberbyRecursion(arr,arr.length-1);
   }

    private static boolean smallestPositiveMissingNumberbyRecursion(int[] arr, int idx) {
      if(idx<0){
        return true;
      }
      
      if(arr[idx]>0){
        if(arr[idx-1]!=arr[idx]-1){
            System.out.println("smallest positive missing number is "+ (arr[idx]-1)+" which should be inserted in index "+(idx-1));
            return false;
        }
    }
        return smallestPositiveMissingNumberbyRecursion(arr, idx-1);
    }
}