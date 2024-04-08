package com.java.interview;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StarPattern1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.input");
		try {
			int input = sc.nextInt();
			Utility.pattern(input);

		} catch (InputMismatchException e) {
			System.out.println("Please provide vaild input ");
		} finally {
			sc.close();
			System.out.println("Stream Closed");
		}
	}
}
