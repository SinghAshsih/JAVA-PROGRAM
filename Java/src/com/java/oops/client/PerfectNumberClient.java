package com.java.oops.client;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.java.oops.PerfectNumber;

public class PerfectNumberClient {
	public static void main(String[] args) {
		System.out.println("Enter the number :");
		Scanner sc = new Scanner(System.in);
		try {
			int num = sc.nextInt();
			PerfectNumber pn = new PerfectNumber(num);
			pn.perfectNumber();
		} catch (InputMismatchException e) {
			System.out.println("Enter the valid number ");
		} finally {
			sc.close();
		}
	}
}
