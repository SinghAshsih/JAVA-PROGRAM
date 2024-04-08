package com.java.oops;

import java.util.Random;

public class RandomNumberGenerator {
	public void randomNumberGenerator() {
		Random r = new Random();
		int num1 = r.nextInt();
		System.out.println("Random number :  " + num1);
		double num2 = r.nextDouble();
		System.out.println("Random number :  " + num2);
	}
}