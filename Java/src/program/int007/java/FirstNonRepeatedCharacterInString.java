package program.int007.java;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacterInString {
	public void noReaptedCharacter() {
		String input = "aabbaaffgnnhmkl";
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (char ch : input.toCharArray()) {
			map.put(ch, map.containsKey(ch) ? map.get(ch) + 1 : 1);
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey());
				break;
			}
		}

	}

	public static void main(String[] args) {
		FirstNonRepeatedCharacterInString fb = new FirstNonRepeatedCharacterInString();
		fb.noReaptedCharacter();

	}
}
