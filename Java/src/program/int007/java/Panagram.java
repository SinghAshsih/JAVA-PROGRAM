package program.int007.java;

import java.util.Scanner;

public class Panagram {
	public static void main(String[] args) {
		System.out.println("Enter the string ");
		@SuppressWarnings("resource")
		String input = new Scanner(System.in).nextLine();
		boolean result = check(input);
		System.out.println(result);
	}

	private static boolean check(String input) {
		if (input.length() < 26) {
			return false;
		} else {
			for (char ch = 'a'; ch <= 'z'; ch++) {
				if (input.indexOf(ch) < 0)
					return false;
			}
		}
		return true;
	}
}
