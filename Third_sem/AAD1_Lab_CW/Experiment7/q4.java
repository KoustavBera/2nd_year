import java.util.Scanner;

/**  
	* WAP to find the element pair wit min max difference
 */
public class q4 {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the size of the array");
	Scanner sc=new Scanner(System.in);
	int n = sc.nextInt();
	int[]arr = new int[n];
	System.out.println("Enter the array elements");
	for(int i=0;i<n;i++){
		arr[i] = sc.nextInt();
	}
	findMinMaxDifference(arr);
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
	private static void findMinMaxDifference(int[] arr) {
		BubbleSort(arr);
		System.out.println("First no: "+arr[arr.length-1]+"\nSecond no:"+arr[0]+"\nMax Difference = "+(arr[arr.length-1]-arr[0]));
		System.out.println("\nFirst no: "+arr[1]+"\nSecond no:"+arr[0]+"\nMin Difference = "+(arr[1]-arr[0]));
	}
}
