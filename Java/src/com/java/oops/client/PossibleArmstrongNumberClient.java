package com.java.oops.client;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.java.exception.InvalidNumberException;
import com.java.oops.PossibleArmstrongNumber;

public class PossibleArmstrongNumberClient {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit ");
		try {
			int limit = sc.nextInt();
			PossibleArmstrongNumber pa = new PossibleArmstrongNumber(limit);
			pa.possibleArmstrong();
		} catch (InvalidNumberException e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("Please enter the valid input ");
		} finally {
			sc.close();
		}
	}
}
