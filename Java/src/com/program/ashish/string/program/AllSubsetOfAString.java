package com.program.ashish.string.program;

import java.util.Scanner;

public class AllSubsetOfAString {
	public static void main(String[] args) {
		System.out.println("Enter the string ");
		Scanner sc = new Scanner(System.in);
		try {
			String input = sc.nextLine();
			allSubSet(input);
		} finally {
			sc.close();
		}
	}

	private static void allSubSet(String input) {
		// TODO Auto-generated method stub
		int length = input.length();
		int temp = 0;
		String[] subset = new String[(length * (length + 1) / 2)];
		for (int i = 0; i < input.length(); i++) {
			for (int j = i; j < input.length(); j++) {
				subset[temp] = input.substring(i, j + 1);
				temp++;
			}
		}
		System.out.println("All subset of a given string are as follows :- ");
		for (String s : subset) {
			System.out.println(s.toUpperCase());
		}

	}
}
