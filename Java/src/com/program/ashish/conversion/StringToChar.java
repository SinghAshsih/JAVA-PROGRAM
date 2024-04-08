package com.program.ashish.conversion;

public class StringToChar {
	public static void main(String[] args) {
		String str = "A";
		char ch = str.charAt(0);
		System.out.println(ch);
	}
}

class CharToString {
	public static void main(String[] args) {
		char ch = 'A';
		String str = String.valueOf(ch);
		System.out.println(str);
	}
}
