package com.java.oops.client;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.java.oops.LeapYear;

public class LeapYearClient {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year ");
		try {
			int year = sc.nextInt();
			LeapYear lp = new LeapYear(year);
			lp.checkYear();
		} catch (InputMismatchException e) {
			System.out.println("Please enter the valid input ");
		} finally {
			sc.close();
		}
	}
}
