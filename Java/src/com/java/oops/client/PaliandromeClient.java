package com.java.oops.client;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.java.exception.InvalidNumberException;
import com.java.oops.PaliandromeNumber;

public class PaliandromeClient {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		try {
			int num = sc.nextInt();
			PaliandromeNumber pn = new PaliandromeNumber(num);
			pn.paliandrome();
		} catch (InvalidNumberException e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("Please enter the valid input .");
		} finally {
			sc.close();
			System.out.println("Stream closed ");
		}
	}
}
