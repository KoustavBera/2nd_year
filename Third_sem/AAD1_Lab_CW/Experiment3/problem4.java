
import java.util.Scanner;
/**  
 * WAP to generate nth fibonacci number
 * Intuition:  we believe that findFibonacci() will give us 1st and 2nd fibonacci number
 * and for any nth input it will return addition n-1th and n-2th number
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