package program.int007.java;

import java.util.Scanner;
import java.util.Stack;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		try {
			int num = sc.nextInt();
			reverse(num);
		} finally {
			sc.close();
		}
	}

	private static void reverse(int num) {
		// TODO Auto-generated method stub
		int reverse = 0;
		while (num > 0) {
			int rem = num % 10;
			reverse = rem + reverse * 10;
			num /= 10;
		}
		System.out.println("Reverse number " + reverse);

	}
}