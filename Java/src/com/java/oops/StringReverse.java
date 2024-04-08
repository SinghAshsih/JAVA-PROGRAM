package com.java.oops;

public class StringReverse {
	private String input;

	public StringReverse(String input) {
		this.input = input;
	}

	public void reverse() {
		String temp = input;
		StringBuilder sb = new StringBuilder(temp);
		System.out.println("String reverse by StringBuilder :  " + sb.reverse());
		reverse(input);
	}

	private void reverse(String input) {
		char[] ch = input.toCharArray();
		System.out.print("String reverse by tocharArray() :  ");
		for (int i = input.length() - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}
	}
}
