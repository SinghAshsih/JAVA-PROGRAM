package com.program.ashish.conversion;

public class ObjectToString {
	public static void main(String[] args) {
		Object o = "Ashish";
		String str = String.valueOf(o);
		System.out.println(str);
	}
}

class StringToObject {
	public static void main(String[] args) throws ClassNotFoundException {
		String str = "Ashish";
		Object object = str;
		System.out.println(object);
//		Class<?> c = Class.forName(str);
//		System.out.println(c.getName());

	}
}