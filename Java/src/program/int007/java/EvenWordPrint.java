package program.int007.java;

public class EvenWordPrint {
	public static void print(String input) {
		String[] arr = input.split(" ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
	}

	public static void main(String[] args) {
		String input = "Ashish singh is a good boy and he will able to understand english ";
		print(input);
	}
}
