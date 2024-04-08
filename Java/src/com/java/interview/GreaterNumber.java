package com.java.interview;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GreaterNumber {
	public static void main(String[] args) {
		System.out.println("Please enter the two numbers :");
		Scanner sc = new Scanner(System.in);
		try {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			Utility.greaterNumber(num1, num2);
		} catch (InputMismatchException e) {
			System.out.println("Invalid input !   Please insert only numbers .");
		} finally {
			sc.close();
			System.out.println("Stream closed");
		}
	}
}
