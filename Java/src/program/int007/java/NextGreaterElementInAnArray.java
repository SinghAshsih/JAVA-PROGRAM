package program.int007.java;

public class NextGreaterElementInAnArray {
	public static void main(String[] args) {
		int[] array = { 12, 3, 1, 5, 46, 752, 36, 7, 3 };
		nextGreater(array);

	}

	private static void nextGreater(int[] array) {
		int next, i, j;
		for (i = 0; i < array.length; i++) {
			next = -1;
			for (j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					next = array[j];
					break;
				}
			}
			System.out.println(array[i] + "  " + next);
		}

	}
}