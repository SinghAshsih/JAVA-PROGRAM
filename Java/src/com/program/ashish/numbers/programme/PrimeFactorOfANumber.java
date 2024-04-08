package com.program.ashish.numbers.programme;

import java.util.List;
import java.util.Scanner;

import com.program.ashish.Utility07;

public class PrimeFactorOfANumber {
	public static void main(String[] args) {
		System.out.println("Enter the number ");
		Scanner sc = new Scanner(System.in);
		try {
			int num = sc.nextInt();
			List<Integer> factor = Utility07.factors(num);
			System.out.println("Factors are as follows :- ");
			for (int i : factor) {
				System.out.print(i + "  ");
			}
		} finally {
			sc.close();
		}
	}
}
