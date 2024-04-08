package com.java.oops.client;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.java.oops.LargestElementInArray;

public class LargestElementClient {
	public static void main(String[] args) {
		System.out.println("Enter the numbers of integer :");
		Scanner sc = new Scanner(System.in);
		try {
			int limit = sc.nextInt();
			LargestElementInArray lar = new LargestElementInArray(limit);
			lar.integers();
		} catch (InputMismatchException e) {
			System.out.println("Please enter the valid input ");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Please enter the valid index");
		}

		finally {
			sc.close();
		}

	}
}
