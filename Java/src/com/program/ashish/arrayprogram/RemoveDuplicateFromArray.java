package com.program.ashish.arrayprogram;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateFromArray {
	public static void main(String[] args) {
		Integer[] num = { 12, 13, 15, 15, 13, 17, 14 };
		Arrays.sort(num);
		List<Integer> asList = Arrays.asList(num);
		asList.stream().distinct().forEach(System.out::println);

	}
}
