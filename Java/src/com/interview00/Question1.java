package com.interview00;

import java.util.Arrays;
import java.util.List;

public class Question1 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		int sumOfEven = list.stream().filter(x -> x % 2 != 0).mapToInt(x -> x).sum();
		System.out.println(sumOfEven);

	}
}
