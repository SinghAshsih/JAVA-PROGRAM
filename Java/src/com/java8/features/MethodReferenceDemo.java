package com.java8.features;

public class MethodReferenceDemo {
	public static void main(String[] args) {

		Functionl f = Test::divide;
		f.calculator(64, 8);

	}
}

class Test {
	public static void add(int a, int b) {
		System.out.println("Sum is " + (a + b));
	}

	public static void sub(int a, int b) {
		System.out.println("Subtraction is " + (a - b));
	}

	public static void product(int a, int b) {
		System.out.println("Product is " + (a * b));
	}

	public static void divide(int a, int b) {
		System.out.println("Division is " + (a / b));
	}
}