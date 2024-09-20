package AD;
import java.util.Scanner;
/**  
 * factorial of number
 * 
 */
/**
 * problem3
 */
public class problem3 {

    public static void main(String[] args) {
        System.out.println("Find factorial");
        System.out.println("Enter the value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact =findFactorial(n);
        System.out.println("The factorial of "+n+" is "+ fact);
        }

    private static int findFactorial(int n) {
      if(n == 0){
        return 1;
      }
return findFactorial(n-1)*n;
    }
}
