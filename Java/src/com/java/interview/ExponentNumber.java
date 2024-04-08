package com.java.interview;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExponentNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		try {
			int num = sc.nextInt();
			System.out.println("Enter the power :");
			int power = sc.nextInt();
			Utility.exponentnumber(num, power);
		} catch (InputMismatchException e) {
			System.out.println("Please enter the valid number ");
		} finally {
			sc.close();
			System.out.println("Stream Closed .");
		}
	}
}
