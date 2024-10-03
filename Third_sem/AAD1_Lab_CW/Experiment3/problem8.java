import java.util.Scanner;

/**
 * problem8
 */
public class problem8 {

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