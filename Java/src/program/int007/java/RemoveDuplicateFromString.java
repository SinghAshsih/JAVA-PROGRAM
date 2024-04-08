package program.int007.java;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateFromString {

	public static void removeDuplicateFromString(String input) {
		System.out.println("After removing :");
		StringBuffer sb = new StringBuffer();
		Set<Character> set = new HashSet<>();

		for (int i = 0; i < input.length(); i++) {
			Character c = input.charAt(i);
			if (!set.contains(c)) {
				set.add(c);
				sb.append(c);
			}

		}
		System.out.println("OutPut:  " + sb);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the string ");
			String input = sc.nextLine();
			removeDuplicateFromString(input);

		} finally {
			sc.close();
		}
	}
}
