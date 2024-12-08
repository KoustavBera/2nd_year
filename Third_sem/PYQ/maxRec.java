public class maxRec {

	public static void main(String[] args) {
		int[] arr = {3,2,1,5,10};
		System.out.println(rec(arr,arr.length-2));
			}
		
			private static int rec(int[] arr, int n) {
				if(n<=1){
					return arr[1];
				}
				int small=rec(arr, n-1);
				return small< arr[n]? arr[n]: small;
			}
}