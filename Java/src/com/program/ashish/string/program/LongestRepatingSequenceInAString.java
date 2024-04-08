package com.program.ashish.string.program;

import java.util.Scanner;

public class LongestRepatingSequenceInAString {
	public static void main(String[] args) {
		System.out.println("Enter the string :");
		Scanner sc = new Scanner(System.in);
		try {
			String input = sc.nextLine();
			repatingSequence(input);
		} finally {
			sc.close();
		}
	}

	private static void repatingSequence(String input) {
		// TODO Auto-generated method stub
		String lrs = "";
		int n = input.length();
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				String x = lcp(input.substring(i, n), input.substring(j, n));
				if (x.length() > lrs.length())
					lrs = x;
			}
		}
		System.out.println("Longest repeating sequence: " + lrs);
	}

	private static String lcp(String substring, String substring2) {
		// TODO Auto-generated method stub
		int n = Math.min(substring.length(), substring2.length());
		for (int i = 0; i < n; i++) {
			if (substring.charAt(i) != substring2.charAt(i)) {
				return substring.substring(0, i);
			}
		}
		return substring.substring(0, n);
	}
}
