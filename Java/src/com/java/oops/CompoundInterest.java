package com.java.oops;

public class CompoundInterest {
	private double principal;
	private double rate;
	private double time;

	public CompoundInterest(double principal, double rate, double time) {
		this.principal = principal;
		this.rate = rate;
		this.time = time;
	}

	public void compoundInterest() {
		double temp = (1 + rate / 100);
		double amount = principal * Math.pow(temp, time);
		System.out.println("The amount is  " + amount);
		double ci = amount - principal;
		System.out.println("The compound interest is  " + ci);
	}
}
