package com.program.ashish.string.program;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		System.out.println("Enter the string ");
		Scanner sc = new Scanner(System.in);
		try {
			String input = sc.nextLine();
			String result = reverse1(input);
			System.out.println(result);
			reverse2(input);
			reverse3(input);
		} finally {
			sc.close();
		}
	}

	private static void reverse3(String input) {
		// TODO Auto-generated method stub
		System.out.println("---------------------------------------------------------");
		StringBuilder sb = new StringBuilder(input);
		sb.reverse();
		System.out.println("Reverse   :  " + sb.toString());

	}

	private static void reverse2(String input) {
		// TODO Auto-generated method stub
		System.out.println("--------------------------------------------------------");
		String temp = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			temp = temp + input.charAt(i);

		}
		System.out.println("Reverse :  " + temp);

	}

	private static String reverse1(String input) {
		// TODO Auto-generated method stub
		String temp = "";
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			temp = ch + temp;
		}
		return temp;

	}
}
