package com.java.interview;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			// Principal
			System.out.println("Enter the principal amount ");
			double p = sc.nextDouble();
			// Rate
			System.out.println("Enter the rate ");
			double r = sc.nextDouble();
			// Time
			System.out.println("Enter the time ");
			double t = sc.nextDouble();
			Utility.simpleInterest(p, r, t);
		} catch (InputMismatchException e) {
			System.out.println("Please enter valid data !");
		} finally {
			sc.close();
			System.out.println("Stream closed");
		}
	}
}
