package com.program.ashish.string.program;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class MostRepeatedWordInAString {
	public static void main(String[] args) {
		System.out.println("Enter the input ");
		Scanner sc = new Scanner(System.in);
		try {
			String input = sc.nextLine();
			mostRepeated(input);
		} finally {
			sc.close();
		}
	}

	private static void mostRepeated(String input) {
		// TODO Auto-generated method stub
		input = input.replaceAll("[^a-zA-Z ]", "");
		input = input.toLowerCase();
		Map<String, Integer> map = new LinkedHashMap<>();
		String[] words = input.split(" ");
		for (String word : words) {
			int count = map.getOrDefault(word, 0);
			map.put(word, count + 1);
		}
		String mostRepeatedWord = "";
		int maxCount = 0;
		for (Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() > maxCount) {
				maxCount = entry.getValue();
				mostRepeatedWord = entry.getKey();
			}
			System.out.println(entry.getKey() + " ->   " + entry.getValue());
		}
		System.out.println("Most repeated word: " + mostRepeatedWord + " (" + maxCount + " times)");
	}

}