package com.java.interview;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		System.out.println("Enter the factorial number :");
		Scanner sc = new Scanner(System.in);
		try {
			int num = sc.nextInt();
			Utility.factorial(num);

		} catch (InputMismatchException e) {
			System.out.println("Please enter only number :");
		} finally {
			sc.close();
			System.out.println("Stream Closed");
		}
	}
}
