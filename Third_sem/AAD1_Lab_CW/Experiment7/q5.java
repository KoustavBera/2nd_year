import java.util.Scanner;

/**   
	* WAP to find the element which appears to be th emaxm o of times 
 */

public class q5 {
	public static void main(String[] args) {
			
		System.out.println("Enter the size of the array");
	Scanner sc=new Scanner(System.in);
	int n = sc.nextInt();
	int[]arr = new int[n];
	System.out.println("Enter the array elements");
	for(int i=0;i<n;i++){
		arr[i] = sc.nextInt();
	}
	findMaxFrequency(arr);
	}

	private static void findMaxFrequency(int[] arr) {
		int[] isPresent = new int[arr.length*10];
	for(int i=0;i<arr.length;i++){
			isPresent[arr[i]]++;
		}
		int maxFreq = 1,maxElement=-1;
	for(int i=0;i<isPresent.length;i++){
		if(isPresent[i]!=1){
			if(isPresent[i]>=maxFreq){
				maxFreq = isPresent[i];
				maxElement = i;
				System.out.println("no: "+maxElement);
				System.out.println("freq: "+maxFreq);
			}
		}
		}

}

}
