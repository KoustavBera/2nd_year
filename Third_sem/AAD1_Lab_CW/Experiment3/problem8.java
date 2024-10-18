
import java.util.Scanner;

/**
 * problem8
 */
public class problem8 {
	/***  
	 * Intuition/ How it works?
	 *  
	 *  1234 % 16 = 2
	 *  77   % 16 = 12(D)
	 *  4    % 16 = 4
	 * 
	 * Ans is 4D2
	    1234 % 16 = 2 } our only task is to find the first remainder and add it to answer so ___ + hexChars[number%2]
		 ----------------------------------------------------------------------------------
	 *  77   % 16 = 12(D) } we expect that our DecToHex() func will give us 4D
	 *  4    % 16 = 4     } so DecToHex(number/16)
	 * 
	 * 
	 */

	private static char[] hexChars = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

	public static String DecToHex(int number){
		if(number == 0){
			return "";
		}
		return DecToHex(number/16) + hexChars[number%16];
	}
	public static void main(String[] args) {
		System.out.println("Enter the number whose hexadecimal you want to find");
		Scanner sc= new Scanner(System.in);
		int number = sc.nextInt();
		String ans = DecToHex(number);
		System.out.println("Decimal   : "+number+"\nHexadecimal : "+ans);
	}
}