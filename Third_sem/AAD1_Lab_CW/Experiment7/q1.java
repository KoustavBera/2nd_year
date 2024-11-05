// Given an unsorted list of n number. WAJ to find th efirst element which is  repeated
import java.util.*;
/**
	* q1
	*/
public class q1 {
public static void main(String[] args) {
	System.out.println("Enter the size of the array");
	Scanner sc=new Scanner(System.in);
	int n = sc.nextInt();
	int[]arr = new int[n];
	System.out.println("Enter the array elements");
	for(int i=0;i<n;i++){
		arr[i] = sc.nextInt();
	}
	findRepeated(arr);
}

private static void findRepeated(int[] arr) {
	boolean[] isPresent = new boolean[arr.length*75];
	for(int i=0;i<arr.length;i++){
		if(!isPresent[arr[i]]){
			isPresent[arr[i]] = true;
		}
		else{
			System.out.println(arr[i]);
			return;
		}
	}
}
}