package com.java.oops;

public class FibonacciSeries {
	private int num1;
	private int num2;
	private int n;

	public FibonacciSeries(int num1, int num2, int n) {
		this.num1 = num1;
		this.num2 = num2;
		this.n = n;
	}

	public void fibonacciSeries() {
		int sum = 0;
		System.out.println("The FibonacciSeries is :");
		System.out.print(num1 + " " + num2 + " ");
		while (n > 0) {
			sum = num1 + num2;
			System.out.print(sum + " ");
			num1 = num2;
			num2 = sum;
			n--;
		}

	}
}
