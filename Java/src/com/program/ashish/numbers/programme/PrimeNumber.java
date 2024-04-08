package com.program.ashish.numbers.programme;

import java.util.Scanner;

import com.program.ashish.Utility07;

public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		try {
			int num = sc.nextInt();
			boolean result = Utility07.isPrimeNumber(num);
			if (result == true) {
				System.out.println("Prime");
			} else {
				System.out.println("Not Prime");
			}
		} finally {
			sc.close();
		}
	}
}
