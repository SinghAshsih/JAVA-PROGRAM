package com.java.interview;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GreatestCommonDivision {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the num1");
			int num1 = sc.nextInt();
			System.out.println("Enter the num2");
			int num2 = sc.nextInt();
			Utility.greatestCommonDivision(num1, num2);

		} catch (InputMismatchException e) {
			System.out.println("Enter the valid input ");
		} finally {
			sc.close();
			System.out.println("Stream Closed");
		}
	}
}
