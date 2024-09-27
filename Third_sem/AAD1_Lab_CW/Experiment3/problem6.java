package Third_sem.AAD1_Lab_CW.Experiment3.AD;
import java.util.Scanner;
/*  
 * to compute nth power of a number
 * 
 * keep these things in mind while computing a to the power of b
 * 1)a^0 = 1
 * 2)a^1=a
 * 3)a^even eg a^6 = a^3 * a^3  
 * 4)a^odd  eg a^7 = a^3 * a^3 * a 
 * 
 * put these concepts in the function together and boom our functionn is ready
 * 
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
          int smallAns = power(b,p/2);

          if(p%2==0){
            return smallAns*smallAns;
          }
          else{
            return smallAns*smallAns*b;
          }
        }
    }