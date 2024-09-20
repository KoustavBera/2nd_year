package AD;
import java.util.Scanner;
/*  
 * to find the GCD
 */
/**
 * problem5
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
    if(n2==0){
        return n1;
    }
     return GCD(n2,n1%n2);
    }

}