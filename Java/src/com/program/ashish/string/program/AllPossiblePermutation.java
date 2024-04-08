package com.program.ashish.string.program;

import java.util.Scanner;

public class AllPossiblePermutation {
	public static void main(String[] args) {
		System.out.println("Enter the string ");
		Scanner sc = new Scanner(System.in);
		try {
			String input = sc.nextLine();
			allPossiblePermutation(input);
		} finally {
			sc.close();
		}
	}

	private static void allPossiblePermutation(String input) {
		// TODO Auto-generated method stub
		for(int i=0;i<input.length();i++) {
			input=input;
		}
		 
		
	}
}
