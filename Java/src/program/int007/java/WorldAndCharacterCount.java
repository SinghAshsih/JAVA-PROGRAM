package program.int007.java;

public class WorldAndCharacterCount {
	public static void main(String[] args) {
		String input = "My name is ashish singh";
		count(input);
	}

	private static void count(String input) {
		// TODO Auto-generated method stub
		int totalCount = 0;
		int wordCount = 0;
		String[] str = input.split(" ");
		for (int i = 0; i < str.length; i++) {
			wordCount = str[i].length();
			totalCount = totalCount + wordCount;
			System.out.println(str[i] + " -> " + wordCount);
		}
		System.out.println("Total Count ->  " + totalCount);

	}
}
