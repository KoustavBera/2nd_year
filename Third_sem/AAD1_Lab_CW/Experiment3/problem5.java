
import java.util.Scanner;
/*  
 * to find the GCD
 * 
 * Intuition: Oh to solve this question we must have clear idea of Euclidean Algorithm.
 * Dont worry here's what it is: 
 * Let’s say we want to find the GCD of 48 and 18.
   Divide 48 by 18: the remainder is 12 (since 48 = 18 × 2 + 12).
   Now, replace 48 with 18 and 18 with 12. So, divide 18 by 12: the remainder is 6.
   Replace 18 with 12 and 12 with 6. Divide 12 by 6: the remainder is 0.
   Since the remainder is 0, the GCD is 6.

   our GCD function is getting two terms n1 and n2..if n2 is zero GCD(anything,0) = anything
   and if n!=0 then simply the n1 becomes n2 and n2 becomes the remainder of n1 and n2.
 */
/**
 * problem5
 */
public class problem5 {

    public static void main(String[] args) {
        System.out.println("GCD of a number");
        System.out.println("Enter the value of n1 and n2");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2=sc.nextInt();
        int gcd= GCD(n1,n2);
        System.out.println("GCD of "+n1+" and "+n2+" is "+ gcd);
    }

    private static int GCD(int n1, int n2) {
        //assuming n1>n2
    if(n2==0){
        return n1;
    }
     return GCD(n2,n1%n2);
    }

}