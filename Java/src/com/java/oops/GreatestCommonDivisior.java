package com.java.oops;

import java.util.Scanner;

public class GreatestCommonDivisior {
	private int limit;

	public GreatestCommonDivisior(int limit) {
		this.limit = limit;
	}

	public void noOfInteger() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the no. of integer ");
			int[] numbers = new int[limit];
			for (int i = 0; i < numbers.length; i++) {
				numbers[i] = sc.nextInt();
			}
			int hcf = findHCF(numbers);
			System.out.println("HCF of the given numbers : " + hcf);
		} finally {
			sc.close();
		}
	}

	private int findHCF(int[] numbers) {
		int hcf = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			hcf = findHCF(hcf, numbers[i]);
		}

		return hcf;
	}

	private int findHCF(int num1, int num2) {
		while (num2 > 0) {
			int temp = num2;
			num2 = num1 % num2;
			num1 = temp;
		}
		return num1;
	}
}
