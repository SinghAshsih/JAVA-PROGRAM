package com.program.ashish.arrayprogram;

import java.util.Arrays;

public class SecondLargestInAnArray {
	public static void main(String[] args) {
		int[] num = { 23, 55, 76, 233, 56, 90, 77 };
		secondLargest(num);

	}

	private static void secondLargest(int[] num) {
		// TODO Auto-generated method stub
		Arrays.sort(num);
		System.out.println("Second Largest " + num[num.length - 2]);
		
	}
}
