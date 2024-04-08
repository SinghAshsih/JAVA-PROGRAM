package com.java.interview;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("Enter the input : ");
		Scanner sc = new Scanner(System.in);
		try {
			String input = sc.nextLine();
			String result = Utility.reverseString(input);
			System.out.println("Reverse string is :  " + result);
		} catch (InputMismatchException e) {
			System.out.println("Invalid Input .");
		} finally {
			sc.close();
			System.out.println("Stream Closed ");
		}
	}
}
