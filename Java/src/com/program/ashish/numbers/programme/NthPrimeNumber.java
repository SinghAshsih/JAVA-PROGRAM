package com.program.ashish.numbers.programme;

import java.util.Scanner;

import com.program.ashish.Utility07;

public class NthPrimeNumber {
	public static void main(String[] args) {
		System.out.println("Enter the position to find the prime number");
		Scanner sc = new Scanner(System.in);
		try {
			int position = sc.nextInt();
			Utility07.nthPrimeNumber(position);
		} finally {
			sc.close();
		}
	}
}
