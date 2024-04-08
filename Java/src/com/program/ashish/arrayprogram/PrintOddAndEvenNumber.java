package com.program.ashish.arrayprogram;

public class PrintOddAndEvenNumber {
	public static void main(String[] args) {
		Integer[] num = { 23, 45, 212, 90, 454, 33, 11 };
		for (int n : num) {
			if (n % 2 == 0) {
				System.out.println("EvenNumber ->  " + n);
			} else {
				System.out.println("OddNumber ->  " + n);
			}
		}
	}
}
