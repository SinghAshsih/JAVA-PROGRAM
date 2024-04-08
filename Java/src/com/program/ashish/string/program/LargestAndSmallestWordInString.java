package com.program.ashish.string.program;

import java.util.Scanner;

public class LargestAndSmallestWordInString {
	public static void main(String[] args) {
		System.out.println("Enter the input ");
		Scanner sc = new Scanner(System.in);
		try {
			String input = sc.nextLine();
			largestAndSmallestWord(input);
		} finally {
			sc.close();
		}
	}

	private static void largestAndSmallestWord(String input) {
		// TODO Auto-generated method stub
		int largestWord = 0;
		int smallestWord = 0;
		input = input.replaceAll("[^a-zA-Z ]", "");
		input = input.toLowerCase();
		String words[] = input.split(" ");
		largestWord = words[0].length();
		smallestWord = words[0].length();
		int countL = 0;
		int countS = 0;
		for (int i = 0; i < words.length; i++) {
			int length = words[i].length();

			if (length > largestWord) {
				largestWord = length;
				countS++;
			}
			if (length < smallestWord) {
				smallestWord = length;
				countS++;
			}
		}
		System.out.println("Largest Word  " + largestWord + "  " + words[countL]);
		System.out.println("Smallest Word " + smallestWord + "  " + words[countS]);
	}
}
