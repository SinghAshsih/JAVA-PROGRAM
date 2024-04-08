package www.deepak.oops.program;

import java.util.Scanner;

public class PrimeNumber {

	private static void check(int num) {
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the number ");
		Scanner sc = new Scanner(System.in);
		try {
			int num = sc.nextInt();
			check(num);
		} finally {
			sc.close();
		}
	}
}
