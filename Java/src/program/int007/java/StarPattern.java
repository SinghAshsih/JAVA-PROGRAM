package program.int007.java;

public class StarPattern {

	public void pattern1() {
		int row, column;
		System.out.println("Pattern 1st");
		for (row = 1; row < 6; row++) {
			for (column = 1; column <= row; column++) {
				System.out.print(column);
			}
			System.out.println();
		}

	}

	public void pattern2() {
		int i, j; /// i=row ,j=column
		System.out.println("Second Pattern");
		for (i = 1; i < 6; i++) {
			for (j = 1; j < 6 - i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void pattern3() {
		System.out.println("Pattern 3rd");
		int row = 5;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= row; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void patter4() {
		int row = 5;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for (int i = 1; i < row; i++) {
			for (int j = 1; j <= row - i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		StarPattern sp = new StarPattern();
		sp.pattern1();
		sp.pattern2();
		sp.pattern3();
		sp.patter4();
	}
}
