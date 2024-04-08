package program.int007.java;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringCompression {
	public static void main(String[] args) {
		String str = "ddeeeffaaabbcc";
		compression2(str);
		compression(str);

	}

	private static void compression(String str) {
		Map<Character, Integer> set = new LinkedHashMap<>();
		for (int i = 0; i < str.length(); i++) {
			set.put(str.charAt(i), set.containsKey(str.charAt(i)) ? set.get(str.charAt(i)) + 1 : 1);
		}

		StringBuilder sb = new StringBuilder();
		for (Map.Entry<Character, Integer> entry : set.entrySet()) {
			sb.append(entry.getKey());
			sb.append(entry.getValue());
		}
		System.out.println(sb.toString());
	}

	// Approaches2
	public static void compression2(String str) {
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			if (map.get(str.charAt(i)) != null) {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			} else {
				map.put(str.charAt(i), 1);
			}
		}
		StringBuilder sb = new StringBuilder();
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			sb.append(entry.getKey());
			sb.append(entry.getValue());
		}
		System.out.println(sb.toString());

	}

}
