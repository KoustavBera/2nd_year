package AD;
import java.util.Scanner;
/*  
 * to compute nth power of a number
 * 
 */
public class problem6 {
    public static void main(String[] args) {
        System.out.println("nth power of a number");
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter value of power");
       int p=sc.nextInt();
       System.out.println("enter value of base");
       int b=sc.nextInt();
       int pow;
        pow = power(b,p);
       System.out.println(b+ " to the power of "+p+" = "+pow);
    
        
    }
    
        private static int power(int b, int p) {
          if(p==0){
            return 1;
          }
          if(p==1){
            return b;
          }
          if(p%2==0){
            return power(b,p/2)*power(b, p/2);
          }
          else{
            return   power(b,p/2)*power(b, p/2)*b;
          }
        }
    }