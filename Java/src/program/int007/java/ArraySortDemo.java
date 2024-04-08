package program.int007.java;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortDemo {
	public static void main(String[] args) {
		String[] arr = { "Ashish Singh", "Aman", "Deepak", "Ashmita", "Arjun", "Chetana" };
		System.out.println("Before Sorting:");
		System.out.println(Arrays.toString(arr));
		sortAsc(arr);
		sort(arr);

	}

	private static void sortAsc(String[] arr) {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}

	private static void sort(String[] arr) {
		// TODO Auto-generated method stub
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));

	}
}
