package www.deepak.oops.program;

import java.util.Scanner;

public class Table {
	public static void main(String[] args) {
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the table ");
		n = scanner.nextInt();
		System.out.println("Odd Output");
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				System.out.println(n + " * " + i + " = " + n * i);
				break;
			}
			

		}
		System.out.println('\n' + "Even Output");
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(n + " * " + i + " = " + n * i);
			}
		}
	}
}
