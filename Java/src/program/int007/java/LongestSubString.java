package program.int007.java;

import java.util.HashSet;

public class LongestSubString {
	public static String longest(String input) {
		HashSet<Character> set = new HashSet<>();
		String longestTillNow = "";
		String longestOverall = "";
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (set.contains(ch)) {
				longestTillNow = "";
				set.clear();
			}
			longestTillNow += ch;
			set.add(ch);

			if (longestTillNow.length() > longestOverall.length()) {
				longestOverall = longestTillNow;
			}

		}
		return longestOverall;

	}

	public static void main(String[] args) {
		String input = "ashishsingh";
		System.out.println(longest(input.toLowerCase()));
	}
}
