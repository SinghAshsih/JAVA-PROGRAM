package com.program.ashish.string.program;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCharacterInString {
	public static void main(String[] args) {
		System.out.println("Enter the input :");
		Scanner sc = new Scanner(System.in);
		try {
			String input = sc.nextLine();
			duplicateCharater(input);
		} finally {
			sc.close();
		}
	}

	private static void duplicateCharater(String input) {

		// Use a HashMap for efficient storage and access
		HashMap<Character, Integer> charCountMap = new HashMap<>();

		// Iterate through the string
		for (char c : input.toCharArray()) {
			// Check for duplicates and update counts
			if (charCountMap.containsKey(c)) {
				int count = charCountMap.get(c);
				charCountMap.put(c, count + 1);
			} else {
				charCountMap.put(c, 1);
			}
		}

		// Print duplicate characters (considering spaces)
		System.out.println("Duplicate characters:");
		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.print(entry.getKey() + "  ");
			}
		}

	}
}
