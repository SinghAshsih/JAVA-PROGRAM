package program.int007.java;

import java.util.Scanner;

public class SumOfNaturalNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the limit ");
			int limit = sc.nextInt();
			sumOfNumbers(limit);
		} finally {
			sc.close();
		}

	}

	private static void sumOfNumbers(int limit) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 1; i <= limit; i++) {
			sum += i;
		}
		System.out.println("Sum is " + sum);
	}
}
