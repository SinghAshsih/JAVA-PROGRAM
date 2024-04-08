package com.java.oops.client;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.java.oops.PossiblePrimeNumber;

public class PossiblePrimeNumberClient {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		try {
			int num = sc.nextInt();
			PossiblePrimeNumber ppm = new PossiblePrimeNumber(num);
			ppm.primeNumeber();
		} catch (InputMismatchException e) {
			System.out.println("Enter the valid numbers ");
		} finally {
			sc.close();
			System.out.println("\n" + "Stream Closed");
		}
	}
}
