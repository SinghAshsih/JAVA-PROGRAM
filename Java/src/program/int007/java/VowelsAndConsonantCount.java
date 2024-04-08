package program.int007.java;

public class VowelsAndConsonantCount {
	public static void main(String[] args) {
		String str = "My name";
		count(str.toLowerCase());
	}

	private static void count(String str) {
		// TODO Auto-generated method stub
		int vowelsCount = 0;
		int consonantCount = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == ' ' || ch == '.') {
				continue;
			}
			switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				vowelsCount++;
				break;
			default:
				consonantCount++;
			}
		}
		System.out.println("No of vowels is  " + vowelsCount);
		System.out.println("No of consanant is  " + consonantCount);

	}
}

class Count {
	public static void main(String[] args) {
		String str = "My name is ashish";
		int vowels = 0;
		int consonant = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == ' ' || ch == '.') {
				continue;
			}
			if (isVowels(ch)) {
				vowels++;
			} else {
				consonant++;
			}
		}
		System.out.println("vowels  " + vowels);
		System.out.println("Consonant  " + consonant);
	}

	private static boolean isVowels(char ch) {
		// TODO Auto-generated method stub
		return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
	}
}