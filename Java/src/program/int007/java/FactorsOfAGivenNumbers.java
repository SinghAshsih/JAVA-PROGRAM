package program.int007.java;

import java.util.Scanner;

public class FactorsOfAGivenNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input : ");
		try {
			int num = sc.nextInt();
			System.out.println("The number of factor of a given numbers are :-> ");

			for (int i = 1; i <=num / 2; i++) {
				if (num % i == 0) {
					System.out.print(i + " ");
				}
			}
			System.out.print("" + num);
		} finally {
			sc.close();
		}
	}
}
