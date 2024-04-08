package com.program.ashish.arrayprogram;

public class SumOfElementOfAnArray {
	public static void main(String[] args) {
		int[] num = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 1 };
		int sum = 0;
		for (int i : num) {
			sum = sum + i;
		}
		System.out.println("Sum is " + sum);
	}
}
