package program.int007.java;

public class PrintElementAtEvenPosition {
	public static void main(String[] args) {
		int[] num = { 12, 2, 34, 5, 6, 7, 3, 22, 89, 0, 98 };
		for (int i = 2; i < num.length; i = i + 2) {
			System.out.println("Index = " + i + " Valaue = " + num[i]);
		}

	}
}
