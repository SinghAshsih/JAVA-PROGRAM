package program.int007.java;

import java.util.Scanner;

public class PrimeNumberCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the num ");
			int num = sc.nextInt();
			isPrime(num);
		} finally {
			sc.close();
		}

	}

	private static void isPrime(int num) {
		// TODO Auto-generated method stub
		boolean flag = false;
		for (int i = 2; i <=num / 2; i++) {
			if (num % i == 0) {
				flag = true;
			}
		}
		if (!flag) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}

	}
}
