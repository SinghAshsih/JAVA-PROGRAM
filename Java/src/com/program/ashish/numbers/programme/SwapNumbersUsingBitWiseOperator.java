package com.program.ashish.numbers.programme;

import java.util.Scanner;

import com.program.ashish.Utility07;

public class SwapNumbersUsingBitWiseOperator {
	public static void main(String[] args) {
		System.out.println("Enter the first number ");
		Scanner sc = new Scanner(System.in);
		try {
			int a = sc.nextInt();
			System.out.println("Enter the second number ");
			int b = sc.nextInt();
			System.out.println("Before Swapping ");
			System.out.println(a + " " + b);
			Utility07.swapUsingBitwise(a, b);
		} finally {
			sc.close();
		}
	}
}
