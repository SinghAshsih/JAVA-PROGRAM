package com.program.ashish.string.program;

import java.util.Scanner;

public class ReplaceSpaceFromString {
	public static void main(String[] args) {
		System.out.println("Enter the string ");
		Scanner sc = new Scanner(System.in);
		try {
			String input = sc.nextLine();
			replace(input);
			replace2(input);
		} finally {
			sc.close();
		}
	}

private static void replace2(String input) {
		// TODO Auto-generated method stub
		String temp="";
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			if(ch!=' ') {
				temp=temp+ch;
			}
			else {
				temp=temp+"@";
			}
		}
		System.out.println(temp);
	}

	// Approach 1
	private static void replace(String input) {
		// TODO Auto-generated method stub
		String input1 = input.replaceAll(" ", "@");
		System.out.println(input1);
	}
}
