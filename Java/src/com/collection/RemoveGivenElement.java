package com.collection;

import java.util.Arrays;
import java.util.List;

public class RemoveGivenElement {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
		Integer target = 3;
		System.out.println("Before removing");
		System.out.println(list);
		list.remove(3);
		System.out.println("After removing");
		System.out.println(list);
	}
}
