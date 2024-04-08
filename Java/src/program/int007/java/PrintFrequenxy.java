package program.int007.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PrintFrequenxy {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		String name = "Banana";
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);
			Integer value = map.get(c);
			if (value != null) {
				map.put(c, new Integer(value + 1));
			} else {
				map.put(c, 1);
			}
		}
		Set<Entry<Character, Integer>> set = map.entrySet();
		List<Entry<Character, Integer>> list = new ArrayList<>(set);
		Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {

			@Override
			public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}

		});
		for (Entry<Character, Integer> ent : list) {
			System.out.println(ent.getKey() + "  " + ent.getValue());
		}

	}
}
