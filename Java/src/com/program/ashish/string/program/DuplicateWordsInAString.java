package com.program.ashish.string.program;

import java.util.Scanner;

public class DuplicateWordsInAString {
	public static void main(String[] args) {
		System.out.println("Enter the input ");
		Scanner sc = new Scanner(System.in);
		try {
			String input = sc.nextLine();
			duplicateWords(input);

		} finally {
			sc.close();
		}
	}

	private static void duplicateWords(String input) {
		// TODO Auto-generated method stub
		input = input.toLowerCase();
		// input = input.replaceAll(".", " ");
		String[] arr = input.split(" ");
		
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				if (arr[i].equals(arr[j])) {
					count++;
				}

			}
			if (count >= 1&& arr[i] != "0") {
				System.out.println(arr[i]);
				count = 0;
			}
		}
	}
}
