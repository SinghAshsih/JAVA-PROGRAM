package com.java.oops.client;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.java.oops.SimpleInterestCalculator;

public class SimpleInterestClient {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the principal amount ");
			int p = sc.nextInt();
			System.out.println("Enter the rate ");
			int r = sc.nextInt();
			System.out.println("Enter the time ");
			int t = sc.nextInt();
			SimpleInterestCalculator si = new SimpleInterestCalculator(p, r, t);
			si.simpleInterest();
		} catch (InputMismatchException e) {
			System.out.println("Enter the valid input ");
		} finally {
			sc.close();
		}
	}
}
