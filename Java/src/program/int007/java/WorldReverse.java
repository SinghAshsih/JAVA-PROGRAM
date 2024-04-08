package program.int007.java;

public class WorldReverse {
	public static void main(String[] args) {
		String input = "Ashish singh rathore";
		String[] split = input.split(" ");
		for (int i = split.length - 1; i >= 0; i--) {
			System.out.print(split[i] + " ");
		}
	}
}
