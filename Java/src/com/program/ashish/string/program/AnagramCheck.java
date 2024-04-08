package com.program.ashish.string.program;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
	public static void main(String[] args) {
		System.out.println("Enter the first String ");
		Scanner sc = new Scanner(System.in);
		try {
			String input1 = sc.nextLine();
			System.out.println("Enter the second String ");
			String input2 = sc.nextLine();
			isAnagram(input1, input2);
		} finally {
			sc.close();
		}

	}

	private static void isAnagram(String input1, String input2) {
		// TODO Auto-generated method stub
		String s1 = input1.replaceAll("\\s", "");
		String s2 = input2.replaceAll("\\s", "");
		char[] ch1 = s1.toLowerCase().toCharArray();
		char[] ch2 = s2.toLowerCase().toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		boolean equals = Arrays.equals(ch1, ch2);
		if (equals == true) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not Anagram");
		}
	}
}
