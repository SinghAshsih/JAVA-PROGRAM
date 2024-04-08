package program.int007.java;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElementFromArray {

	public static void remove(int[] arr, int remove) {
		int[] newArray = new int[arr.length - 1];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != remove) {
				newArray[index] = arr[i];
				index++;
			}
		}
		System.out.println("After removing :");
		System.out.println(Arrays.toString(newArray));
	}

	public static void main(String[] args) {
		System.out.println("Original :");
		Scanner sc = new Scanner(System.in);
		try {
			int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
			System.out.println(Arrays.toString(arr));
			System.out.println("Enter the remove element");
			int remove = sc.nextInt();
			remove(arr, remove);
		} finally {
			sc.close();
		}
	}
}
