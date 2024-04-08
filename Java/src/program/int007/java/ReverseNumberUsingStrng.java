package program.int007.java;

public class ReverseNumberUsingStrng {
	public static void main(String[] args) {
		int num = 6544;
		String str = String.valueOf(num);
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println(reverse);
	}
}
