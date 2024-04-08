package com.java.oops.client;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.java.oops.Exponentiation;

public class ExponentiationClient {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		try {
			int num = sc.nextInt();
			System.out.println("Enter the power");
			int exponent = sc.nextInt();
			Exponentiation ex = new Exponentiation(num, exponent);
			ex.exponent();

		} catch (InputMismatchException e) {
			System.out.println("Please enter the only integers ");
		} finally {

			sc.close();
			System.out.println("Stream Closed");
		}
	}
}
