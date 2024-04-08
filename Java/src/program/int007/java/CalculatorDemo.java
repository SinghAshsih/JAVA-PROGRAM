package program.int007.java;

import java.util.Scanner;

public class CalculatorDemo {
	public static void main(String[] args) {
		double d1, d2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		d1 = sc.nextDouble();
		d2 = sc.nextDouble();
		System.out.println("Enter the operator to perform operation (+,-,*,/,% )");
		char op = sc.next().charAt(0);
		double o = 0;
		switch (op) {

		case '+':
			o = d1 + d2;
			break;
		case '-':
			o = d1 - d2;
			break;
		case '*':
			o = d1 * d2;
			break;
		case '/':
			o = d1 / d2;
			break;
		case '%':
			o = d1 % d2;
			break;
		default:
			System.out.println("You have entered wrong operator ");
			break;
		}

		System.out.println(d1 + " " + op + " " + d2 + " = " + o);
	}
}
