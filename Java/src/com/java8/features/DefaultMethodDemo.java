package com.java8.features;

public class DefaultMethodDemo implements DefaultInterface {
	// yes we can override default method in java
	@Override
	public void add(int a, int b) {
		System.out.println("sub is " + (a - b));
	}

	public static void main(String[] args) {
		DefaultMethodDemo demo = new DefaultMethodDemo();
		demo.add(40, 34);
	}

}
