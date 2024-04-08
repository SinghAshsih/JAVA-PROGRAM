package program.int007.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class FirstNonRepeatedCharacterFromString {

	public static char notRepeated(String input) {
		Map<Character, Integer> map = new HashMap<>();

		for (char c : input.toCharArray()) {
			map.put(c, map.containsKey(c) ? map.get(c) + 1 : 1);
		}
		for (Entry<Character, Integer> em : map.entrySet()) {
			if (em.getValue() == 1) {
				return em.getKey();
			}
		}
		throw new RuntimeException("Did not find any non repeted character ");

	}

	public static void main(String[] args) {
		System.out.println("Enter the input :");
		Scanner sc = new Scanner(System.in);
		try {
			String name = sc.nextLine();
			char ch = notRepeated(name);
			System.out.println("First Non repeated character is :  " + ch);
		} finally {
			sc.close();
		}
	}

}
