package program.int007.java;

public class FirstLetterOfEachWord {
	public static void main(String[] args) {
		String str = "My name is ashish singh";
		m1(str);
	}

	private static void m1(String str) {
		// TODO Auto-generated method stub
		String[] split = str.split(" ");
		for (int i = 0; i < split.length; i++) {
			String temp = split[i];
			System.out.println(temp.charAt(0));
		}

	}
}
