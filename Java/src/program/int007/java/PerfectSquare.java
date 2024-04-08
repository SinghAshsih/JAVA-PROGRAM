package program.int007.java;

import java.util.Scanner;

public class PerfectSquare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		try {
			boolean not = false;
			int num = sc.nextInt();
			if (num < 0) {
				System.out.println("Dont enter negative number");
				System.exit(1);
			}
			for (int i = 0; i <= num; i++) {
				if (i * i == num) {
					System.out.println("Perfect Square");
					not = true;
					break;
				}
			}
			if (not == false) {
				System.out.println("Not perfect square ");
			}
		} finally {
			sc.close();
		}
	}
}
