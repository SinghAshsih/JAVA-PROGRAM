package com.program.ashish.numbers.programme;

import java.util.Scanner;

import com.program.ashish.Utility07;

public class FactorialByRecursion {
	public static void main(String[] args) {
		System.out.println("Enter the number you want to factorial  : ");
		Scanner sc = new Scanner(System.in);
		try {
			int num = sc.nextInt();

			if (num >= 0) {
				int factorial = Utility07.factorial(num);
				System.out.println("Factorial is " + factorial);
			} else {
				System.out.println("Please enter the positive number");
			}
		} finally {
			sc.close();
		}
	}
}