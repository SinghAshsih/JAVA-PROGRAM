package program.int007.java;

import java.util.Scanner;

public class RemoveAllWhiteSpacesInAString {
	String input;

	public RemoveAllWhiteSpacesInAString(String input) {
		this.input = input;
	}

	public void remove() {
		String output = "";
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ' ') {
				continue;
			} else {
				output = output + input.charAt(i);
			}
		}
		System.out.println(output);
	}

	public static void main(String[] args) {
		System.out.println("Enter the input :");
		Scanner sc = new Scanner(System.in);
		try {
			String input = sc.nextLine();
			RemoveAllWhiteSpacesInAString rm = new RemoveAllWhiteSpacesInAString(input);
			rm.remove();
		} finally {
			sc.close();
		}
	}
}
