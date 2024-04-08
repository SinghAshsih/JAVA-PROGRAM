package com.java.interview;

public class LinerarSearchProgram {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		int n = arr.length;
		int x = 4 ;
		int index = Utility.linearSearch(arr, n, x);
		if (index == -1)
			System.out.println("Element is not present in the array");
		else
			System.out.println("Element found at position " + index);
	}
}
