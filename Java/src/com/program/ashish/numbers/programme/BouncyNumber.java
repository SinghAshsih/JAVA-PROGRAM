package com.program.ashish.numbers.programme;

import java.util.Scanner;

import com.program.ashish.Utility07;

public class BouncyNumber {
	public static void main(String[] args) {
		System.out.println("Enter the number ");
		Scanner sc = new Scanner(System.in);
		try {
			int num = sc.nextInt();
			Utility07.isBouncyNumber(num);

		} finally {
			sc.close();
		}
	}
}