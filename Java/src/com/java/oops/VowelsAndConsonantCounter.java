package com.java.oops;

public class VowelsAndConsonantCounter {
	private String input;

	public VowelsAndConsonantCounter(String input) {
		this.input = input;
	}

	public void counter() {
		char ch;
		int vowelCount = 0;
		int consonantCount = 0;
		for (int i = 0; i < input.length(); i++) {
			ch = input.charAt(i);
			if (ch == ' ' || ch == '1' || ch == '2' || ch == '3' || ch == '4' || ch == '5' || ch == '6' || ch == '7'
					|| ch == '8' || ch == '9' || ch == '0') {
				continue;
			}
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowelCount++;
			} else {
				consonantCount++;
			}

		}
		System.out.println("No. of vowels in a string is  " + vowelCount);
		System.out.println("No. of consonant in a string is  " + consonantCount);
	}
}
