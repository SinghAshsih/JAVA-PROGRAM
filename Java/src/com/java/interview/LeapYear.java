package com.java.interview;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year ");
		try {
			int year = sc.nextInt();
			Utility.checkLeapYear(year);
		} catch (InputMismatchException e) {
			System.out.println("Enter the valid number : ");
		} finally {
			sc.close();
			System.out.println("Stream Closed :");
		}

	}
}
