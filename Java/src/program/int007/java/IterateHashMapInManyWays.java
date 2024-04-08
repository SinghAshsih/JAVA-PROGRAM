package program.int007.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateHashMapInManyWays {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Apple");
		map.put(2, "Mango");
		map.put(3, "Banana");
		map.put(4, "Orange");
		map.put(5, "Papaya");
//		keySetIteration(map);
//   	iteratorMap(map);
		// entrySetMap(map);
		// streamApiMap(map);
		forEachLoop(map);

	}

	private static void forEachLoop(Map<Integer, String> map) {
		// TODO Auto-generated method stub
		map.forEach((key, value) -> {
			System.out.println("Key " + key);
			System.out.println("Value " + value);
		});

	}

	// using stream api java 8
	private static void streamApiMap(Map<Integer, String> map) {
		// TODO Auto-generated method stub
		map.entrySet().stream().forEach(e -> System.out.println("key " + e.getKey() + " -- Value  " + e.getValue()));

	}

	// Using EntrySet()
	private static void entrySetMap(Map<Integer, String> map) {
		// TODO Auto-generated method stub
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("Key ->  " + entry.getKey());
			System.out.println("Value -> " + entry.getValue());
		}

	}

	// Using Iterator
	private static void iteratorMap(Map<Integer, String> map) {
		// TODO Auto-generated method stub
		Iterator<Map.Entry<Integer, String>> itr = map.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<Integer, String> entry = itr.next();
			System.out.println("Key - " + entry.getKey());
			System.out.println("Valaue - " + entry.getValue());
		}

	}

	// Using KeySet
	private static void keySetIteration(Map<Integer, String> map) {
		// TODO Auto-generated method stub
		for (Integer fruitId : map.keySet()) {
			System.out.println("Key Value = " + fruitId);
			System.out.println("Value = " + map.get(fruitId));

		}

	}
}
