package com.java.interview;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NeonNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number .");
		try {
			int num = sc.nextInt();
			Utility.neonNumber(num);
		} catch (InputMismatchException e) {
			System.out.println("Enter the valid number :");
		} finally {
			sc.close();
			System.out.println("Stream closed ");
		}
	}
}
