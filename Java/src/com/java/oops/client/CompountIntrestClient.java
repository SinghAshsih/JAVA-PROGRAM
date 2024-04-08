package com.java.oops.client;

import java.util.Scanner;

import com.java.oops.CompoundInterest;

public class CompountIntrestClient {
	public static void main(String[] args) {
		System.out.println("Enter the principal amount :");
		Scanner sc = new Scanner(System.in);
		try {
			double p = sc.nextDouble();
			System.out.println("Enter the rate ");
			double r = sc.nextDouble();
			System.out.println("Enter the time ");
			double t = sc.nextDouble();
			CompoundInterest ci = new CompoundInterest(p, r, t);
			ci.compoundInterest();
		} finally {
			sc.close();
		}
	}
}
