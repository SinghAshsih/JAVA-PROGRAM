package program.int007.java;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first numbers ");
		try {
			int num1 = sc.nextInt();
			System.out.println("Enter the second number");
			int num2 = sc.nextInt();
			byte count = 0;
			int sum = 0;
			System.out.print(num1 + " " + num2 + " ");
			while (count < 10) {
				sum = num1 + num2;
				System.out.print(sum + " ");
				num1 = num2;
				num2 = sum;
				count++;
			}
		} finally {
			sc.close();
		}
	}
}
