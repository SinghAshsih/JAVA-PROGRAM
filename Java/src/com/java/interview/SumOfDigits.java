package com.java.interview;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the number : ");
			int num = sc.nextInt();
			int result = Utility.sumOfDigits(num);
			System.out.println("The sum of digits of number is " + result);
		} catch (InputMismatchException e) {
			System.out.println("Enter the valid number : ");
		} finally {
			sc.close();
			System.out.println("Stream Closed :");
		}
	}
}
