package com.java.oops;

public class PerfectNumber {
	private int num;

	public PerfectNumber(int num) {
		this.num = num;
	}

	public void perfectNumber() {
		int pro = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				pro = pro + i;
			}
		}
		if (pro == num) {
			System.out.println("Perfect Number ");

		} else {
			System.out.println("Not perfect number ");
		}
	}
}
