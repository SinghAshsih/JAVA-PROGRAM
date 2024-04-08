package program.int007.java;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = { 12, 45, 76, 43, 7, 9, 67, 0, 10, 1, 2, 3, 4 };
		int find = 33;
		int index = binarySearch(arr, 0, arr.length - 1, find);
		System.out.println("Element find at index " + index);
	}

	private static int binarySearch(int[] arr, int low, int high, int find) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		if (high >= low) {

			int mid = low + ((high - low) / 2);
			if (arr[mid] == find) {
				return mid;
			}
			if (find > arr[mid]) {
				return binarySearch(arr, mid + 1, high, find);
			}
			if (find < arr[mid]) {
				return binarySearch(arr, low, mid - 1, find);
			}
		}
		return -1;
	}

}
