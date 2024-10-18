public class q3 {
	public static void isReverseSorted(int[] arr){
	int startindex=-1, endindex=-1;
	for(int i=1; i<arr.length;i++){
		if(arr[i]<arr[i-1]){
  startindex = i-1;	
		break;
		}
	}
 endindex=startindex;
	for(int i=startindex;i<arr.length;i++){
		if(arr[i]<arr[i-1]){
		 endindex++;
			}
	}
	System.out.println("start index: "+(startindex+1));
	System.out.println("end index: "+(endindex+1));
	}
	public static void main(String[] args) {
		int[] arr={1,2,3,5,8,6,5,4,7};
		isReverseSorted(arr);
	}
}
