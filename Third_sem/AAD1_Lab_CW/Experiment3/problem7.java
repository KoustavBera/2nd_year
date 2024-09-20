package AD;
import java.util.Scanner;

/*  
 * to smallest positive missing number
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
            System.out.println(arr[idx]-1);
            return false;
        }
    }
        return smallestPositiveMissingNumberbyRecursion(arr, idx-1);
    }
}