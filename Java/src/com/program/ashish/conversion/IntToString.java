package com.program.ashish.conversion;

public class IntToString {
	public static void main(String[] args) {
		int num = 2324;
		String number = String.valueOf(num);
		System.out.println(number);

		long l = Long.parseLong(number);
		System.out.println(l);

	}
}
