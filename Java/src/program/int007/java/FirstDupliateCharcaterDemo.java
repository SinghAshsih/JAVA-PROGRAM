package program.int007.java;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FirstDupliateCharcaterDemo {
	// Approach 1
	public static void main(String[] args) {
		String name = "Ashhish";
		approach1(name);
		approach2(name);

	}

	private static void approach2(String name) {
		// TODO Auto-generated method stub
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			map.put(ch, map.containsKey(ch) ? map.get(ch) + 1 : 1);
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "    " + entry.getValue());
		}
	}

	private static void approach1(String name) {
		// TODO Auto-generated method stub
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (!set.contains(ch)) {
				set.add(ch);
			} else {
				System.out.println("First Dublicate Character is ->   " + ch);
				break;
			}

		}
	}
}
