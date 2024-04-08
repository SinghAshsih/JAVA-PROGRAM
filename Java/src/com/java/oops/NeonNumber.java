package com.java.oops;

public class NeonNumber {
	private int num;

	public NeonNumber(int num) {
		this.num = num;
	}

	public void neonNumber() {
		int square = (int) Math.pow(num, 2);
		int sum = 0;
		while (square > 0) {
			int digit = square % 10;
			sum = sum + digit;
			square /= 10;
		}
		if (sum == num) {
			System.out.println("Neon Numbers");
		} else {
			System.out.println("Not neon Numbers");
		}

	}
}
