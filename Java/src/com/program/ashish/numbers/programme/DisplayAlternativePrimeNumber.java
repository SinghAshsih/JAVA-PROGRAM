package com.program.ashish.numbers.programme;

import java.util.Scanner;

import com.program.ashish.Utility07;

public class DisplayAlternativePrimeNumber {
	public static void main(String[] args) {
		System.out.println("Enter the limit ");
		Scanner sc = new Scanner(System.in);
		try {
			int limit = sc.nextInt();
			Utility07.dislpayAlternativePrimeNumber(limit);
		} finally {
			sc.close();
		}
	}
}

class Test {
	public static void main(String[] args) {
		int limit = 50;
		int count = 0;
		int i, j;
		for (i = 1; i <= limit; i++) {
			//int temp = i;
			for (j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				count = 0;
				System.out.println(i);
			}
		}
	}
}