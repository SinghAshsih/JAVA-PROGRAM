package com.program.ashish.string.program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountTotalNumberCharacterInString {
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
		System.out.println("----------------------------------------------------");
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) != ' ')
				count++;
		}
		System.out.println("Total number of character is " + count);

	}

	private static void count2(String input) {
		// TODO Auto-generated method stub
		System.out.println("----------------------------------------------------");
		List<Character> list = new ArrayList<>();
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == ' ')
				continue;
			list.add(ch);
		}
		System.out.println("Total number of character is " + list.size());

	}

	private static void count(String input) {
		// TODO Auto-generated method stub
		int length = input.length();
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == ' ') {
				count++;
			}
		}
		int total = length - count;
		System.out.println("Total number of character is " + total);
	}
}
