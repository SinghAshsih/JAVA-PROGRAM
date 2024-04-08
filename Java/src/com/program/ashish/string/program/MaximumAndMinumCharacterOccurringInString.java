package com.program.ashish.string.program;

import java.util.Scanner;

public class MaximumAndMinumCharacterOccurringInString {
	public static void main(String[] args) {
		System.out.println("Enter the string ");
		Scanner sc = new Scanner(System.in);
		try {
			String input = sc.nextLine();
			minAndMax(input);
		} finally {
			sc.close();
		}
	}
//	for (char c : input.toCharArray()) {
//		// Check for duplicates and update counts
//		if (charCountMap.containsKey(c)) {
//			int count = charCountMap.get(c);
//			charCountMap.put(c, count + 1);
//		} else {
//			charCountMap.put(c, 1);
//		}
//	}

	private static void minAndMax(String input) {
		// TODO Auto-generated method stub
		char[] ch = input.toLowerCase().toCharArray();

	}
}