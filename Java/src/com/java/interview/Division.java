package com.java.interview;

import java.util.Scanner;

public class Division {


	public static void main(String[] args) {
		System.out.println("Enter the number ");
		Scanner sc = new Scanner(System.in);
		try {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int result = Utility.division(a, b);
			System.out.println("Division is :  " + result);
		} catch (ArithmeticException e) {
			System.out.println("Can not divided by zero ");
		} finally {
			sc.close();
			System.out.println("Stream Closed...");
		}
	}
}
