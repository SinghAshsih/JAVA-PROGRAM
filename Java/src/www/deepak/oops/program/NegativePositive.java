package www.deepak.oops.program;

import java.util.Scanner;

public class NegativePositive {
	public static void main(String[] args) {
		System.out.println("Enter the number ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num < 0) {
			System.out.println("This is negative number ");
		} else if (num == 0) {
			System.out.println("Number is zero");
		}
		else {
			System.out.println("Number is positive ");
		}
	}
}
