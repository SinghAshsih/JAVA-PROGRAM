package com.java.oops.client;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.java.oops.SumOfDigits;

public class SumOfDigitsClient {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		try {
			int num = sc.nextInt();
			SumOfDigits sm = new SumOfDigits(num);
			sm.sumOfDigit();
		} catch (InputMismatchException e) {
			System.out.println("Enter the valid number ");

		} finally {
			sc.close();
		}
	}
}
