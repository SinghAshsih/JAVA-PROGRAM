package com.java.interview;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the numbers ");
			int num = sc.nextInt();
			Utility.checkPrimeNumber(num);
			System.out.println("---------------------------------------------");
			// System.out.println("Do you want to print all possible prime number of a given
			// number . Give me YES OR NO");
			// String input = sc.nextLine();
			System.out.println("The possible prime numbers of a given numbers are as follows :");
			Utility.allPossiblePrimeNumber(num);
		} catch (InputMismatchException e) {
			System.out.println("Please enter the valid input : ");
		} finally {
			sc.close();
			System.out.println("\n" + "Stream Closed ");
		}
	}
}

