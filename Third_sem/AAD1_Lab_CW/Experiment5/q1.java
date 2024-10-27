package Experiment5;
/*   
	* Reduction operation in an array

 */
public class q1 {

	public static void main(String[] args) {
		int[] arr ={5,1,1,1,2,3,5};
		System.out.println("Array After reduction : ");
		reductArray(arr);
	}

 public static int findMin(int [] arr){
		int min=Integer.MAX_VALUE;
	 for(int i=0;i<arr.length;i++){
			if(arr[i]>0 && arr[i]<min){
				min=arr[i];
			}
		}
		return min;
	}

	public static boolean isEveryElementZero(int[] arr){
		for(int i:arr){
			if(i!=0) return false;
		}
		return true;
	}
	 
	public static void reductArray(int[] arr){

  while (!isEveryElementZero(arr)) {
			int min = findMin(arr);
			for(int i=0;i<arr.length;i++){
				if(arr[i]>0){
					arr[i]=arr[i]-min;
				}
			}
			printArr(arr);
			}
			}
			public static void printArr(int[] arr) {
				System.out.println();
				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i] + " ");
				}
	}
}
