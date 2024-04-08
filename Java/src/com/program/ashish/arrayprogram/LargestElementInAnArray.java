package com.program.ashish.arrayprogram;

import java.util.Arrays;
import java.util.OptionalInt;

public class LargestElementInAnArray {
	public static void main(String[] args) {
		int[] num = { 1, 2, 4, 6, 4, 2, 7, 8, 66, 8, 8, 66, 54, 35, 99 };
		max(num);
		maxByOther(num);
		greater(num);
	}

	private static void greater(int[] num) {
		// TODO Auto-generated method stub
		OptionalInt max = Arrays.stream(num).max();
		OptionalInt min = Arrays.stream(num).min();
		System.out.println("Min is " + min);
		System.out.println("Max is " + max);

	}

	private static void maxByOther(int[] num) {
		// TODO Auto-generated method stub
		Arrays.sort(num);
		System.out.println("Min is " + num[0]);
		System.out.println("MaxByOther is " + num[num.length - 1]);

	}

	private static void max(int[] num) {
		// TODO Auto-generated method stub
		int max = 0;
		int min = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] > max) {
				max = num[i];
			}
			if (num[i] < min) {
				min = num[i];
			}
		}
		System.out.println("Min is " + min);
		System.out.println("Max is " + max);
	}
}
