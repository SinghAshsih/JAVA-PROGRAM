package com.program.ashish.string.program;

import java.util.Scanner;

public class StringPaliandrome {
	public static void main(String[] args) {
		System.out.println("Enter the string ");
		Scanner sc = new Scanner(System.in);
		try {
			String input = sc.nextLine();
			checkPaliandrome(input);
		} finally {
			sc.close();
		}
	}

	private static void checkPaliandrome(String input) {
		// TODO Auto-generated method stub
		String temp = "";
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			temp = ch + temp;
		}
		System.out.println("Reverse String ->  " + temp);
		if (input.equalsIgnoreCase(temp)) {
			System.out.println("Yes it is in paliandrome ");
		} else {
			System.out.println("No it is not in paliandrome ");
		}
	}
}
