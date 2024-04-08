package www.deepak.oops.program;

import java.util.Scanner;

public class GreaterNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number ");
		int num1 = sc.nextInt();
		System.out.println("Enter the 2nd number");
		int num2 = sc.nextInt();
		if (num1 < num2) {
			System.out.println(num2);
		} else if (num1 == num2) {
			System.out.println("Numbers are equals :");
		} else {
			System.out.println(num1);
		}
	}
}
