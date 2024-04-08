package com.java.interview;

import java.util.Scanner;

public class CountVowelsAndConsonantInAString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input ");
		try {
			String input = sc.nextLine();
			Utility.countBySwitch(input);
		} finally {
			sc.close();
		}
	}
}
