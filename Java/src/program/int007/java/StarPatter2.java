package program.int007.java;

public class StarPatter2 {
// Pyramid
	public static void main(String[] args) {
		int row = 6;
		int column = 6;
		for (int i = 1; i < row; i++) {
			for (int j = 1; j < column; j++) {
				System.out.print(j);
			}
			System.out.println();
			column--;
		}
	}
}
