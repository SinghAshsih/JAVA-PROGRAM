package com.java.interview;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CompoundInterest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the principal amount :");
			double principal = sc.nextDouble();
			System.out.println("Enter the rate : ");
			double rate = sc.nextDouble();
			System.out.println("Enter the time : ");
			double time = sc.nextDouble();
			Utility.compountInterest(principal, rate, time);
		} catch (InputMismatchException e) {
			System.out.println("Enter the valid input : ");
		} finally {
			sc.close();
			System.out.println("Stream Closed: ");
		}
	}
}
