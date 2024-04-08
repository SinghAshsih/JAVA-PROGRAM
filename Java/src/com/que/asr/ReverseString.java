package com.que.asr;

public class ReverseString {
	public static void main(String[] args) {
		// Approach 1A
		String name = "Ashish";
		String reverse = "";
		for (int i = 0; i < name.length(); i++) {
			reverse = name.charAt(i) + reverse;
		}
		System.out.print(reverse);
		System.out.println("");
		// Approach 1B
		for (int i = name.length() - 1; i >= 0; i--) {
			System.out.print(name.charAt(i));
		}
		System.out.println("");
		// Approach 2
		char[] ch = name.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}
		System.out.println(""); 
		// Approach 3
		StringBuffer sb = new StringBuffer(name);
		System.out.println(sb.reverse());
        //Approach 4
		System.out.print("");
		StringBuilder sb2 = new StringBuilder(name);
		System.out.println(sb2.reverse());
	}
}
