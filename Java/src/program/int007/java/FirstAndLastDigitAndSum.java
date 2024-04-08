package program.int007.java;

import java.util.Scanner;

public class FirstAndLastDigitAndSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the number ");
			int num = sc.nextInt();
			int lastDigit = num % 10;
			int firstDigit = 0;
			while (num >=10) {
				firstDigit = num/10;
				num /= 10;
			}
			int sum = firstDigit + lastDigit;
			System.out.println("FirstDigit " + firstDigit);
			System.out.println("LastDigit " + lastDigit);
			System.out.println("Sum " + sum);
		} finally {
			sc.close();
		}
	}
}
