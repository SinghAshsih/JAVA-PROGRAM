package com.java.oops;

import java.util.Scanner;

public class LargestElementInArray {
	private int limit;

	public LargestElementInArray(int limit) {
		this.limit = limit;
	}

	public void integers() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integers ");
		try {
			int[] numbers = new int[limit];
			for (int i = 0; i < numbers.length; i++) {
				numbers[i] = sc.nextInt();
			}
			System.out.println("The input array :");
			for (int a : numbers) {
				System.out.print(a + " ");
			}
			largestElement(numbers);
		} finally {
			sc.close();
		}

	}

	private void largestElement(int[] numbers) {
		int largest = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > largest) {
				largest = numbers[i];
			}
		}
		System.out.println("\n" + "Largest element in an array is " + largest);
	}
}
