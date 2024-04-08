package com.program.ashish.numbers.programme;

import java.util.Scanner;

import com.program.ashish.Utility07;

public class SmallestAmongThreeUsingTernaryOperator {
	public static void main(String[] args) {
		System.out.println("Enter the num 1 ");
		Scanner sc = new Scanner(System.in);
		try {
			int num1 = sc.nextInt();
			System.out.println("Enter the num2");
			int num2 = sc.nextInt();
			System.out.println("Entet the num3");
			int num3 = sc.nextInt();
			Utility07.checkSmallest(num1, num2, num3);
		} finally {
			sc.close();
		}
	}
}
