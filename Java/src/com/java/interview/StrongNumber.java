package com.java.interview;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StrongNumber {
	public static void main(String[] args) {
		System.out.println("Enter the term  number :");
		Scanner sc = new Scanner(System.in);
		try {
			int num = sc.nextInt();
			Utility.strongNumber(num);
		} catch (InputMismatchException e) {
			System.out.println("Please enter only number :");
		} finally {
			sc.close();
			System.out.println("\n" + "Stream Closed ");
		}
	}
}
