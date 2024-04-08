package com.program.ashish.conversion;

public class StringToBoolean {
	public static void main(String[] args) {
		String str = "true";
		boolean b = Boolean.parseBoolean(str);
		System.out.println(b);
	}
}

class BooleanToString {
	public static void main(String[] args) {
		boolean b = false;
		String str = String.valueOf(b);
		System.out.println(str);
	}
}