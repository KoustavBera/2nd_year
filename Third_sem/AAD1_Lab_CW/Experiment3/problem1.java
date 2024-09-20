package AD;

/** 
 * Find sum of n numbers using RF
 */

import java.util.Scanner;

/**
 * problem1
 */
public class problem1 {

    public static void main(String[] args) {
        System.out.println("Sum of n numbers using Recursion");
        System.out.println("Enter the value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = sumOfNNumbersUsingRecursion(arr,arr.length-1);
        System.out.println("Sum of " + n + " numbers is " + sum);
    }

    private static int sumOfNNumbersUsingRecursion(int[] arr, int idx) {
if(idx<0){
    return 0;
}
return (sumOfNNumbersUsingRecursion(arr, idx-1))+arr[idx];
    }
}