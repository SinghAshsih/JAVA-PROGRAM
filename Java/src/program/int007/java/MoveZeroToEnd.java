package program.int007.java;

public class MoveZeroToEnd {
	public static void main(String[] args) {
		int[] arr = { 0, 34, 0, 56, 7, 3, 11, 0, 0 };
		int[] newArr = new int[arr.length];
		System.out.println("Before Shifting ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
		move(arr, newArr);
	}

	private static void move(int[] arr, int[] newArr) {
		// TODO Auto-generated method stub
		int j = 0;
		for (int i = 0; i < newArr.length; i++) {
			if (arr[i] != 0) {
				newArr[j] = arr[i];
				j++;
			}
		}
		for (int i = 0; i < newArr.length; i++) {
			if (arr[i] == 0) {
				newArr[j] = arr[i];
				j++;
			}
		}
		System.out.println("After sorting ");
		for (int num : newArr) {
			System.out.print(num + " ");
		}

	}
}
