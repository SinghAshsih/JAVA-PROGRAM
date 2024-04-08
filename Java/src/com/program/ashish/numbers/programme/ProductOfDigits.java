package com.program.ashish.numbers.programme;

import java.util.Scanner;

import com.program.ashish.Utility07;

public class ProductOfDigits {
	public static void main(String[] args) {
		System.out.println("Enter the number ");
		Scanner sc = new Scanner(System.in);
		try {
			int num = sc.nextInt();
			int product = Utility07.productOfDigits(num);
			System.out.println("Sum of digit is " + product);
		} finally {
			sc.close();
		}

	}
}
