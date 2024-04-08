package com.program.ashish.numbers.programme;

import java.util.Scanner;

import com.program.ashish.Utility07;

public class SquareRootWithoutSqrtMethod {
	public static void main(String[] args) {
		System.out.println("Enter the square number ");
		Scanner sc = new Scanner(System.in);
		try {
			int num = sc.nextInt();
			Utility07.sqrt(num);
		} finally {
			sc.close();
		}
	}
}
