package com.java.interview;

import java.util.Scanner;

public class PaliandromeString {

	public static void main(String[] args) {
		System.out.println("Enter the input :");
		Scanner sc = new Scanner(System.in);
		try {
			String input = sc.nextLine();
			Utility.paliandrome(input);
		}
		finally {
			sc.close();
			System.out.println("Stream Closed.");
		}
	}
}
