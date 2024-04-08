package com.java.oops;

public class PaliandromeString {
	private String input;

	public PaliandromeString(String input) {
		this.input = input;
	}

	public void checker() {
		String temp = "";
		for (int i = 0; i < input.length(); i++) {
			temp = input.charAt(i) + temp;
		}
		if (temp.equalsIgnoreCase(input)) {
			System.out.println("This is paliandrome ");
		} else {
			System.out.println("This is not in paliandrome ");
		}

	}
}
