package program.int007.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class VowelsCountWordAndFrequency {

	public static int vowels(String input) {
		int count = 0;
		String temp = input.toLowerCase();
		for (int i = 0; i < temp.length(); i++) {
			if (temp.charAt(i) == ' ') {
				continue;
			}
			switch (temp.charAt(i)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;
			default:
				break;
			}
		}

		return count;
	}

	public static void countWords(String input) {
		String[] array = input.split(" ");
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + '\t' + array[i].length());
		}
	}

	public static void frequency(String input) {
		Map<Character, Integer> map = new HashMap<>();
		char[] ch = input.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == ' ')
				continue;
			map.put(ch[i], map.containsKey(ch[i]) ? map.get(ch[i]) + 1 : 1);
		}
		for (Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "   " + entry.getValue());
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the string ");
		Scanner sc = new Scanner(System.in);
		try {
			String input = sc.nextLine();
			int vowelsCount = vowels(input);
			System.out.println("Numbers of vowels in a given string is ->   " + vowelsCount);
			countWords(input);
			System.out.println();
			frequency(input);
		} finally {
			sc.close();
		}
	}
}
