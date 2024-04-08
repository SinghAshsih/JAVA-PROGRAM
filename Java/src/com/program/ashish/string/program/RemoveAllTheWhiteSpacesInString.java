package com.program.ashish.string.program;

import java.util.Scanner;

public class RemoveAllTheWhiteSpacesInString {
public static void main(String[] args) {
	System.out.println("Enter the string ");
	Scanner sc=new Scanner(System.in);
	try {
		String in=sc.nextLine();
		remove(in);
	}
	finally {
		sc.close();
	}
}

private static void remove(String in) {
	// TODO Auto-generated method stub
	String n=in.replaceAll(" ", "");
	System.out.println(n);
}
}
