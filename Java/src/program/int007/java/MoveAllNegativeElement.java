package program.int007.java;

public class MoveAllNegativeElement {
	public static void main(String[] args) {
		int[] arr1 = { 4, 6, 7, 8, 3, -6, 7, -8, 9, 7, 0, 5, 3 };
		int[] arr2 = new int[arr1.length];
		System.out.println("Before shifting ");
		for (int num : arr1) {
			System.out.print(num + " ");
		}
		System.out.println();
		move(arr1, arr2);
	}

	private static void move(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		int j = 0;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] < 0) {
				arr2[j] = arr1[i];
				j++;
			}
		}
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == 0) {
				arr2[j] = arr1[i];
				j++;
			}
			if (arr1[i] > 0) {
				arr2[j] = arr1[i];
				j++;
			}
		}
		System.out.println("After shifiting :");
		for (int num : arr2) {
			System.out.print(num + " ");
		}
	}
}
