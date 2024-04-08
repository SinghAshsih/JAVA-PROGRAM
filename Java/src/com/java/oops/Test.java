package com.java.oops;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of integers: ");
		int numCount = scanner.nextInt();
		int[] numbers = new int[numCount];

		System.out.println("Enter the integers:");
		for (int i = 0; i < numCount; i++) {
			numbers[i] = scanner.nextInt();
		}

		int hcf = findHCF(numbers);
		scanner.close();
		System.out.println("HCF of the given integers is: " + hcf);
	}

	public static int findHCF(int[] numbers) {
		int hcf = numbers[0]; // Initialize with the first number

		for (int i = 1; i < numbers.length; i++) {
			hcf = findHCF(hcf, numbers[i]); // Recursively find HCF of pairs
		}

		
		return hcf;
	}

	// Helper function to find HCF of two numbers (using Euclidean algorithm)
	public static int findHCF(int num1, int num2) {
		while (num2 != 0) {
			int temp = num2;
			num2 = num1 % num2;
			num1 = temp;
		}
		return num1;
	}
}

interface Calculator2 {

	public int add(int a, int b);

}

class Main2 {
	public static void main(String[] args) {
		Calculator2 calculator = (a, b) -> {
			return a + b;
		};

		int sum = calculator.add(10, 20);

		System.out.println(sum);

	}
}