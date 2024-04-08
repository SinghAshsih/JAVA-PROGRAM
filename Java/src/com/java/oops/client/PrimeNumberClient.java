package com.java.oops.client;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.java.oops.PrimeNumber;

public class PrimeNumberClient {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		try {
			int num = sc.nextInt();
			PrimeNumber pm = new PrimeNumber(num);
			boolean result = pm.isPrimeNumber();
			if (result == true) {
				System.out.println("Prime number ");
			} else {
				System.out.println("Not prime number");
			}
		} catch (InputMismatchException e) {
			System.out.println("Enter the valid input ");
		} finally {
			sc.close();
			System.out.println("Stream Closed");
		}
	}
}
