public class q2 {
	public static void main(String[] args) {
		int[] arr1 = {1, 5, 9, 10, 15, 20};
		int[] arr2 = {2, 3, 8, 7};
		mergeArr(arr1, arr2);
	}

	public static void mergeArr(int[] arr1, int[] arr2) {
		int newSize = arr1.length + arr2.length;
		int[] newArr = new int[newSize];

		// Copy elements from arr1 and arr2 to newArr
		for (int i = 0; i < arr1.length; i++) {
			newArr[i] = arr1[i];
		}
		int x = arr1.length;
		for (int i = 0; i < arr2.length; i++) {
			newArr[x++] = arr2[i];
		}

		// Bubble Sort in ascending order
		for (int i = 0; i < newArr.length - 1; i++) {
			for (int j = 0; j < newArr.length - i - 1; j++) {
				if (newArr[j] > newArr[j + 1]) {  // Fixing the comparison for ascending order
					int temp = newArr[j];
					newArr[j] = newArr[j + 1];
					newArr[j + 1] = temp;
				}
			}
		}

		// Print the original arrays and the merged sorted array
		System.out.println("Original");
		System.out.print("arr1=");
		printArr(arr1);
		System.out.print("\narr2=");
		printArr(arr2);


		System.arraycopy(newArr, 0, arr1, 0,arr1.length);
		System.arraycopy(newArr, arr1.length, arr2, 0,arr2.length);
System.out.print("\nAfter sorting\n");
System.out.print("arr1 = ");
printArr(arr1);
System.out.print("\narr2 =");
printArr(arr2);
	}

	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
