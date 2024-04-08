package program.int007.java;

public class StringPaliandrome {
	public static void check(String input) {
		String output = "";
		for (int i = 0; i < input.length(); i++) {
			output = input.charAt(i) + output;
		}
		System.out.println(output);
		if (input.equalsIgnoreCase(output)) {
			System.out.println("Palaindrome");
		} else {
			System.out.println("Not paliandreome");
		}
	}

	public static void main(String[] args) {
		String input = "ashhssa";
		check(input);
	}
}
