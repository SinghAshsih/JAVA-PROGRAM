package com.java.interview;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PossibleArmstrongNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the number");
			int num = sc.nextInt();
			Utility.possibleArmstrongNumber(num);

		} catch (InputMismatchException e) {
			System.out.println("Enter the valid number :");
		} finally {
			sc.close();
			System.out.println("\n" + "Stream Closed");
		}
	}
}
