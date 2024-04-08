package www.deepak.oops.program;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		System.out.println("Enter the factorial number ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int factorial = 1;
		for (int i = num; i >= 1; i--) {
			factorial = factorial + i;
		}
		System.out.println("Factorial is  " + factorial);
	}
}
