package program.int007.java;

public class PrintWithoutUsingLoop {
	public static void main(String[] args) {
		int i = 1;
		print(i);

	}

	private static void print(int i) {
		// TODO Auto-generated method stub

		// int i = 1;
		if (i <= 10) {
			System.out.println(i);
			print(i + 1);
		}

	}
}
