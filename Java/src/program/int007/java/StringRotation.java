package program.int007.java;

public class StringRotation {
	public static void main(String[] args) {
		boolean result = isRotation("abcde", "bcdea");
		System.out.println(result);
	}

	private static boolean isRotation(String str, String rotation) {
		if (str == null || rotation == null) {
			return false;
		} else if (str.length() != rotation.length()) {
			return false;
		} else {
			String concated = str + str;

			return concated.contains(rotation);
		}
	}
}
