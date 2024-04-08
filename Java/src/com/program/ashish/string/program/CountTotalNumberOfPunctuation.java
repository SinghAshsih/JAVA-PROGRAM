package com.program.ashish.string.program;

import java.util.Scanner;

public class CountTotalNumberOfPunctuation {
	public static void main(String[] args) {
		System.out.println("Enter the String ");
		Scanner sc = new Scanner(System.in);
		try {
			String input = sc.nextLine();
			count(input);
			count2(input);
			count3(input);
		} finally {
			sc.close();
		}
	}

	private static void count3(String input) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch >= 'a' && ch <= 'z' || ch >= '1' && ch <= '9' || ch == ' ') {
				continue;
			}
			count++;
		}
		System.out.println("The no. of punctuation mark is " + count);

	}

	private static void count2(String str) {
		// TODO Auto-generated method stub
		System.out.println("-------------------------");
		int count = 0;
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.'
					|| str.charAt(i) == '?' || str.charAt(i) == '-' || str.charAt(i) == '\'' || str.charAt(i) == '\"'
					|| str.charAt(i) == ':')

				count++;

		}
		System.out.println("The no. of punctuation mark is " + count);
	}

	private static void count(String input) {
		// TODO Auto-generated method stub
		System.out.println("==========================================");
	}
}
