package Third_sem.AAD1_Lab_CW.Experiment2;

import java.util.Scanner;

// WAP to find factorial of a number
public class problem4 {
	public static void main(String[] args) {
		System.out.println("Enter the value of n whose factorial is being asked");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int mul=1;
		for(int i=1;i<=n;i++){
			mul *= i;
		}
		System.out.println("Factorial of "+n+"th number is "+mul);
	}
}
