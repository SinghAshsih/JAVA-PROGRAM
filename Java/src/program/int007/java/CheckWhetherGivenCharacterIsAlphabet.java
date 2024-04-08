package program.int007.java;

public class CheckWhetherGivenCharacterIsAlphabet {
	public static void main(String[] args) {
		char input = '4';
		if (input >= 'a' && input <= 'z' || input >= 'A' && input <= 'Z') {
			System.out.println("Yes Alphabet");
		} else {
			System.out.println("Not Alphabet");
		}
	}
}
