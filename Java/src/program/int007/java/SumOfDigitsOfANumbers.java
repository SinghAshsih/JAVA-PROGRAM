package program.int007.java;

import java.util.Scanner;

public class SumOfDigitsOfANumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the number");
			int num = sc.nextInt();
			int sum = sumOfDigits(num);
			System.out.println("Sum of digits is " + sum);
		} finally {
			sc.close();
		}
	}

	private static int sumOfDigits(int num) {
		int sum = 0;
		while (num > 0) {
			int rem = num % 10;
			sum += rem;
			num /= 10;
		}
		return sum;

	}
}
