package com.program.ashish.string.program;

import java.util.Scanner;

public class DivideStringInEqualParts {
	public static void main(String[] args) {
		System.out.println("Enter the string ");
		Scanner sc = new Scanner(System.in);
		try {
			String input = sc.nextLine();
			System.out.println("How many part you wanna divide the given string ");
			int p = sc.nextInt();
			divideString(input, p);
		} finally {
			sc.close();
		}
	}

	private static void divideString(String input, int p) {
		// TODO Auto-generated method stub
		int temp = 0;
		boolean flag = false;
		int chars = input.length() / p;
		String[] equalStr = new String[p];
		if (input.length() % p != 0) {
			System.out.println("Sorry this string cannot be divided into " + p + " equal parts.");
		} else {
			for (int i = 0; i < input.length(); i = i + chars) {
				// Dividing string in n equal part using substring()
				String part = input.substring(i, i + chars);
				equalStr[temp] = part;
				temp++;
				flag = true;
			}

		}
		if (flag == true) {
			System.out.println(p + " equal parts of given string are ");
			for (int i = 0; i < equalStr.length; i++) {
				System.out.println(equalStr[i]);
			}
		}
	}
}
