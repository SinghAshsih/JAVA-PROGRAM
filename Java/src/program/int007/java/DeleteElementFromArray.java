package program.int007.java;

import java.util.Arrays;

public class DeleteElementFromArray {
	public static void main(String[] args) {
		int[] arr = { 12, 34, 56, 78, 90 };
		System.out.println("Original array " + Arrays.toString(arr));
		remove(arr);

	}

	private static void remove(int[] arr) {
		// TODO Auto-generated method stub
		int index = 2;
		int[] newArr = new int[arr.length - 1];
		for (int i = 0, k = 0; i < arr.length; i++) {
			if (i == index) {
				continue;
			}
			newArr[k++] = arr[i];
		}
		System.out.println("New Array " + Arrays.toString(newArr));
	}
}
