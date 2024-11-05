import java.util.Scanner;

/**   
	* Given an unsorted array of n-1 elements which are in the range of 1-n. There is no duplicate in the arrat
	. One of the integer is missing. find the missing no.
 */

public class q3 {
	public static void main(String[] args) {
		System.out.println("Enter the size of the array");
	Scanner sc=new Scanner(System.in);
	int n = sc.nextInt();
	int[]arr = new int[n];
	System.out.println("Enter the array elements");
	for(int i=0;i<n;i++){
		arr[i] = sc.nextInt();
	}
	findMissing(arr);
}
private static void BubbleSort(int[] arr){
	for(int i=0;i<arr.length; i++){
		for(int j=0;j<arr.length-1-i;j++){
			if(arr[j]>arr[j+1]){
    int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
	}
}
	private static void findMissing(int[] arr) {
		BubbleSort(arr);
		for(int i:arr){
			System.out.println(i);
		}
	 for(int i = 0; i < arr.length - 1; i++) {
			if(arr[i + 1] != arr[i] + 1) {
							System.out.println("Missing : " + (arr[i] + 1));
							return;
			}
}
	}
}
