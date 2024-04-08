package program.int007.java;

public class StarPatter1 {
	public static void main(String[] args) {
		int rows = 5;
		int column = 5;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
