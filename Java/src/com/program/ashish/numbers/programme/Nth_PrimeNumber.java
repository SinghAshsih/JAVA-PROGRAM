package com.program.ashish.numbers.programme;

import java.util.Scanner;

import com.program.ashish.Utility07;

public class Nth_PrimeNumber {
	public static void main(String[] args) {
		System.out.println("Enter the position ");
		Scanner sc = new Scanner(System.in);
		try {
			int position = sc.nextInt();
			Utility07.nthPrimeNumber2(position);
		} finally {
			sc.close();
		}
	}
}
