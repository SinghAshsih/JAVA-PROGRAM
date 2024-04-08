package com.java.interview;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HappyNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		try {
			int num = sc.nextInt();
			Utility.happyNumber(num);
		} catch (InputMismatchException e) {
			System.out.println("Please enter the valid input : ");
		} finally {
			sc.close();
			System.out.println("Stream Closed ");
		}
	}
}
