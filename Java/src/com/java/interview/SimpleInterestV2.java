package com.java.interview;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleInterestV2 {

	public double simpleInterest(double p, double r, double t) {
		double si = (p * r * t) / 100;
		return si;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SimpleInterestV2 si = new SimpleInterestV2();
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
			double result = si.simpleInterest(p, r, t);
			System.out.println("Simple interest is : " + result);

		} catch (InputMismatchException e) {
			System.out.println("Please enter valid data !");
		} finally {
			sc.close();
			System.out.println("Stream closed");
		}
	}
}
