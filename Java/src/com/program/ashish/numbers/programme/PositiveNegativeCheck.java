package com.program.ashish.numbers.programme;

import java.util.Scanner;

import com.program.ashish.Utility07;

public class PositiveNegativeCheck {
	public static void main(String[] args) {
		System.out.println("Enter the number ");
		Scanner sc = new Scanner(System.in);
		try {
			int n = sc.nextInt();
			Utility07.positiveNumberCheck(n);
		} finally {
			sc.close();
		}
	}
}
