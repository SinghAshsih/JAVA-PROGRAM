package program.int007.java;

public class BubbleSortDemo {
	public static void main(String[] args) {
		int[] arr = { 9, 8, 7, 5, 6 };
		System.out.println("Before Sorting :-");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		bubbleSort(arr);
		System.out.println('\n' + "After Sorting :");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

	private static void bubbleSort(int[] arr) {
		// TODO Auto-generated method stub
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;

				}
			}
		}
	}
}
