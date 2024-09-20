package AD;
import java.util.Scanner;
/**  
 * WAP to generate nth fibonacci number
 */
/**
 * problem4
 */

public class problem4 {

    public static void main(String[] args) {
        System.out.println("Find nth Fibonacci");

        Scanner sc = new Scanner(System.in);
   
        System.out.println("enter whichth fibonacci number u want");
        int idx=sc.nextInt();
        int fibo= findFibonacci(idx);
        System.out.println("Fibonacci of "+idx+"th number is "+fibo);
    }

    private static int findFibonacci(int idx) {
      if(idx==1){
        return 0;
      }
      if(idx== 2){
        return 1;
      }
      return findFibonacci(idx-1)+findFibonacci( idx-2);
    }

}