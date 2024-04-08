package com.java.oops;

import java.util.Scanner;

public class LinearSearch {
	private int limit;

	public LinearSearch(int limit) {
		this.limit = limit;
	}

	public void findTheElement() {
		boolean result = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of integer ");
		try {
			int[] arr = new int[limit];
			for (int i = 0; i < limit; i++) {
				arr[i] = sc.nextInt();
			}
			for (int i : arr) {
				System.out.print(i + " ");
			}
			System.out.println("\n" + "Enter the element you wanna find in this array :- ");
			int find = sc.nextInt();
			for (int i = 0; i < limit; i++) {
				if (arr[i] == find) {
					result = true;
					System.out.println(find + " is found at index of  " + i);
				}
			}
			if (result == false) {
				System.out.println("No such element is found in the given element : ");
			}

		} catch (IndexOutOfBoundsException e) {
			System.out.println("Index out of range ");
		} finally {
			sc.close();
		}
	}
}
