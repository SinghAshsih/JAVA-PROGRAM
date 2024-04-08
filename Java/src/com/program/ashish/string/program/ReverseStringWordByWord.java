package com.program.ashish.string.program;

import java.util.Scanner;

public class ReverseStringWordByWord {
	public static void main(String[] args) {
		System.out.println("Enter the string ");
		Scanner sc = new Scanner(System.in);
		try {
			String input = sc.nextLine();
			reverse1(input);
		} finally {
			sc.close();
		}
	}

	private static void reverse1(String input) {
		// TODO Auto-generated method stub
		String[] str = input.split(" ");
		String reverse = "";
		for (int i = 0; i < str.length; i++) {
			String temp = str[i];
			reverse = "";
			for (int j = 0; j < temp.length(); j++) {
				reverse = temp.charAt(j) + reverse;
			}
			System.out.print(reverse);
			if (i < str.length-1) {
				System.out.print(" ");
			}
		}
	}
}
