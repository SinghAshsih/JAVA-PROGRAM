package www.deepak.oops.program;

import java.util.Scanner;

public class EvenAndOddNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit");
		int limit = sc.nextInt();
		int position = 2;
		for (int i = 1; i <= limit; i++) {
			int temp = position + 4;
			System.out.print(position + " ");
			position = temp;

		}
	}
}
