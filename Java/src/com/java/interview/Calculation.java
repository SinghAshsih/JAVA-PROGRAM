package com.java.interview;

import java.util.Scanner;

public class Calculation {

	public static void main(String[] args) {
		System.out.println("Enter the input: ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		try {
			// Divide
			int divide = num1 / num2;
			System.out.println("Division of two numbers : " + divide);

			// Sum
			int sum = num1 + num2;
			System.out.println("Sum of two numbers is : " + sum);

		} catch (ArithmeticException e) {
			System.out.println("We can't divide by 0 so please provide another number");
			int num3 = sc.nextInt();
			int divide = num1 / num3;
			System.out.println("Your division result : " + divide);
		}

		finally {
			sc.close();
			System.out.println("Stream closed");
		}

	}
}
