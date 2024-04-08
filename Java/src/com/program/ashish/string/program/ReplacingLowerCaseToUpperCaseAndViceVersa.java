package com.program.ashish.string.program;

import java.util.Scanner;

public class ReplacingLowerCaseToUpperCaseAndViceVersa {
	public static void main(String[] args) {
		System.out.println("Enter the string ");
		Scanner sc = new Scanner(System.in);
		try {
			String input = sc.nextLine();
			replacae(input);
		} finally {
			sc.close();
		}
	}

	private static void replacae(String input) {
		// TODO Auto-generated method stub
		String temp = "";
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				temp =temp+ Character.toString(ch).toUpperCase();
			} else {
				temp = temp+Character.toString(ch).toLowerCase();
			}
			{

			}
		}
		System.out.println(temp);

	}
}
