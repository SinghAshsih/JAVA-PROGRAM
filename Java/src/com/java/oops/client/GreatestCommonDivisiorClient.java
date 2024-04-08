package com.java.oops.client;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.java.oops.GreatestCommonDivisior;

public class GreatestCommonDivisiorClient {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the numbers of integers :  ");
		try {
			int limit = sc.nextInt();

			GreatestCommonDivisior hcf = new GreatestCommonDivisior(limit);
			hcf.noOfInteger();
		} catch (InputMismatchException e) {
			System.out.println("Enter the valid numbers ");
		} finally {
			sc.close();
		}
	}
}
