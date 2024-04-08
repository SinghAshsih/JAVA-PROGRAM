package program.int007.java;

public class StringReverseByRecurrsion {
	public static String reverse(String input) {
		if (input == null || input.length() <= 1) {
			return input;
		}
		return reverse(input.substring(1)) + input.charAt(0);
	}

	public static void main(String[] args) {
		String input = "Ashish";
		System.out.println(reverse(input));
	}
}
