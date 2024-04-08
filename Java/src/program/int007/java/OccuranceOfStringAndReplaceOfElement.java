package program.int007.java;

import java.util.Scanner;

public class OccuranceOfStringAndReplaceOfElement {
	public static void main(String[] args) {
		System.out.println("Enter the input ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int initialLeanth = str.length();
		System.out.println("Enter the characte to find the occurancec ");
		String ch = sc.nextLine();
		str = str.replace(ch, "");
		int finalLength = str.length();
		System.out.println("Total numbers of occurance of character  " + ch + " --> " + (initialLeanth - finalLength));
		sc.close();
	}
}
