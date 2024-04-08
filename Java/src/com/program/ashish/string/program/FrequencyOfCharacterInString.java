package com.program.ashish.string.program;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class FrequencyOfCharacterInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			String input = sc.nextLine();
			occuranceCount(input);
		} finally {
			sc.close();
		}
	}

	private static void occuranceCount(String input) {
		// TODO Auto-generated method stub
		// Create a HashMap to store character counts
		input=input.toLowerCase();
		Map<Character, Integer> charCountMap = new HashMap<>();

		// Iterate through each character in the string
		for (char c : input.toCharArray()) {
			// Check if character already exists in the map
			if (charCountMap.containsKey(c)) {
				int count = charCountMap.get(c);
				charCountMap.put(c, count + 1);
			} else {
				charCountMap.put(c, 1);
			}
		}

		// Print character occurrences
		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

	}
}
