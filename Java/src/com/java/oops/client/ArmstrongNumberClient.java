package com.java.oops.client;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.java.oops.ArmstrongNumber;

public class ArmstrongNumberClient {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		try {
			int num = sc.nextInt();
			ArmstrongNumber an = new ArmstrongNumber(num);
			boolean result = an.isArmstrong();
			if (result == true) {
				System.out.println("Armstrong number");
			} else {
				System.out.println("Not armstrong number ");
			}

		} catch (InputMismatchException e) {
			System.out.println("Enter the valid input ");
		} finally {
			sc.close();
			System.out.println("Stream closed");
		}
	}
}
