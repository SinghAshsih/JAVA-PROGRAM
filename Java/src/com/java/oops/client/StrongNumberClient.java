package com.java.oops.client;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.java.oops.StrongNumber;

public class StrongNumberClient {
	public static void main(String[] args) {
		System.out.println("Enter the number ");
		Scanner sc = new Scanner(System.in);
		try {
			int num = sc.nextInt();
			StrongNumber sn = new StrongNumber(num);
			sn.strongNumber();
		} catch (InputMismatchException e) {
			System.out.println("Please enter the valid input ");
		} finally {
			sc.close();
		}
	}
}
