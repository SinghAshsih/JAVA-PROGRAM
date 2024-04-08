package com.program.ashish.string.program;

import java.util.Scanner;

public class CountTheVowelAndConsonant {
	public static void main(String[] args) {
		System.out.println("Enter the string ");
		Scanner sc = new Scanner(System.in);
		try {
			String input = sc.nextLine();
			approach1(input);
			System.out.println("---------------------------------------------------------");
			approach2(input);
		} finally {
			sc.close();
		}
	}

	private static void approach2(String input) {
		// TODO Auto-generated method stub
		String temp = input.toLowerCase();
		int vowelsCount = 0;
		int consonantCount = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = temp.charAt(i);
			switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				vowelsCount++;
				break;

			case ' ':
				break;
			case '.':
				break;
			default:
				consonantCount++;
			}
		}
		System.out.println("No. of vowels is " + vowelsCount);
		System.out.println("No. of consonant is " + consonantCount);

	}

	private static void approach1(String input) {
		// TODO Auto-generated method stub
		String temp = input.toLowerCase();
		int vowelsCount = 0;
		int consonantCount = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = temp.charAt(i);
			if (ch == ' ' || ch == '.') {
				continue;
			} else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowelsCount++;
			} else {
				consonantCount++;
			}
		}
		System.out.println("No. of vowels is " + vowelsCount);
		System.out.println("No. of consonant is " + consonantCount);
	}
}
