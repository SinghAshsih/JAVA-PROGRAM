package com.java.oops;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementInArray {
	int[] arr = { 1, 2, 3, 1, 2, 4, 4, 5, 6, 7, 6, 8, 9, 6, 8, 9 };

	public void duplicateRemover() {
		System.out.println("Before removing duplicate :");
		Set<Integer> set = new HashSet<>();
		for (Integer n : arr) {
			System.out.print(n + " ");
			set.add(n);
		}
		System.out.println("\n" + "After  removing duplicate :");
		for (Integer n2 : set) {
			System.out.print(n2 + " ");
		}
	}
}
