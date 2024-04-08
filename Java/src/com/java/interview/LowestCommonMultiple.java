package com.java.interview;

import java.util.Scanner;

public class LowestCommonMultiple {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		Utility.lcm(a, b);
		sc.close();
	}
}
