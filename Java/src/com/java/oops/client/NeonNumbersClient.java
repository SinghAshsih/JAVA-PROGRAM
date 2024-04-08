package com.java.oops.client;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.java.oops.NeonNumber;

public class NeonNumbersClient {
	public static void main(String[] args) {
		System.out.println("Enter the numbers ");
		Scanner sc = new Scanner(System.in);
		try {
			int num = sc.nextInt();
			NeonNumber nn = new NeonNumber(num);
			nn.neonNumber();
		} catch (InputMismatchException e) {
			System.out.println("Please enter the valid number ");
		} finally {
			sc.close();
		}
	}
}
