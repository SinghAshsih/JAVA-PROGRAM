package program.int007.java;

public class StringComprasionWithoutFunction {
	public static void main(String[] args) {
		String s1 = "Ashisha";
		String s2 = "Ashishs";
		boolean result = false;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				result = false;
				break;
			}
			result = true;
		}
		System.out.println(result);
	}
}
