package com.java.oops;

public class SimpleInterestCalculator {
	private int principal;
	private int rate;
	private int time;

	public SimpleInterestCalculator(int principal, int rate, int time) {
		this.principal = principal;
		this.rate = rate;
		this.time = time;
	}

	public void simpleInterest() {
		double si = (principal * rate * time) / 100;
		System.out.println("Your simple interest is " + si);
	}
}
