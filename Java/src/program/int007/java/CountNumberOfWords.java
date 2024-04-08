package program.int007.java;

import java.util.Arrays;
import java.util.Scanner;

public class CountNumberOfWords {
	String text;

	public CountNumberOfWords(String input) {
		this.text = input;
	}

	public void count() {
		int wordCount = 0;
		boolean inWord = false;
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			if (Character.isWhitespace(c)) {
				inWord = false;
			} else if (!inWord) {
				wordCount++;
				inWord = true;
			}
		}
		System.out.println("Number of words: " + wordCount);

	}

	public void m1() {
		// Through stream api
		long wordCount = Arrays.stream(text.split("\\s+")).count();
		System.out.println("Number of words: " + wordCount);

	}

	public static void main(String[] args) {
		System.out.println("Enter the input : ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		try {
			CountNumberOfWords count = new CountNumberOfWords(input);
			count.m1();
			;
		} finally {
			sc.close();
		}
	}
}
