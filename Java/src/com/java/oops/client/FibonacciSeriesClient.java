package com.java.oops.client;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.java.oops.FibonacciSeries;

public class FibonacciSeriesClient {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num1");
		try {
			int num1 = sc.nextInt();
			System.out.println("Enter the num2 ");
			int num2 = sc.nextInt();
			System.out.println("Enter the nth value of series ");
			int n = sc.nextInt();
			FibonacciSeries fs = new FibonacciSeries(num1, num2, n);
			fs.fibonacciSeries();

		} catch (InputMismatchException e) {
			System.out.println("Please enter the valid input");

		} finally {
			sc.close();
			System.out.println("\n" + "Stream Closed");
		}
	}
}
