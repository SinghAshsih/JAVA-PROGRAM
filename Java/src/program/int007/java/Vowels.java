package program.int007.java;

import java.util.Scanner;

public class Vowels {
	public static void vowels(String input) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == ' ')
				continue;
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}

		}
		System.out.println("No of vowels is " + count);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the string ");
			String input = sc.nextLine();
			vowels(input);
		} finally {
			sc.close();
		}
	}
}
