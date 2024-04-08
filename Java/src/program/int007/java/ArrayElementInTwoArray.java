package program.int007.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ArrayElementInTwoArray {
	public static void main(String[] args) {
		Integer[] i1 = { 1, 2, 3, 9, 8, 7 };
		Integer[] i2 = { 4, 1, 2, 10, 15, 7 };
		Integer[] i3 = { 5, 1, 2, 4, 10 };
		HashSet<Integer> h = new HashSet<Integer>();
		List<Integer> l1 = Arrays.asList(i1);
		List<Integer> l2 = Arrays.asList(i2);
		List<Integer> l3 = Arrays.asList(i3);
		h.addAll(l1);
		h.addAll(l2);
		h.addAll(l3);
		List<Integer> finalList = new ArrayList<>();
		for (Integer i : h) {
			if (l1.contains(i) && l2.contains(i) || l2.contains(i) && l3.contains(i)
					|| l3.contains(i) && l1.contains(i)) {
				finalList.add(i);
			}
		}
		System.out.println(finalList);
	}
}
