package com.program.ashish.numbers.programme;

import java.util.Scanner;

import com.program.ashish.Utility07;

public class SumOfNaturalNumbers {
	public static void main(String[] args) {
		System.out.println("Enter the limit ");
		Scanner sc = new Scanner(System.in);
		try {
			int limit = sc.nextInt();
			Utility07.SumOfNumbers(limit);
		} finally {
			sc.close();

		}
	}
}
