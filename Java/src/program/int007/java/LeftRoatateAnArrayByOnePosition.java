package program.int007.java;

public class LeftRoatateAnArrayByOnePosition {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		// int[] arr2 = new int[arr.length];
		System.out.println("Before Shifting :");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
		// shiftByOne(arr, arr2);
		shiftByOne2(arr);

	}

	private static void shiftByOne2(int[] arr) {
		// TODO Auto-generated method stub
		int temp = arr[0];
		for (int i = 1; i < arr.length; i++) {
			arr[i - 1] = arr[i];
		}
		arr[arr.length - 1] = temp;
		System.out.println("After shifting");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

//	private static void shiftByOne(int[] arr, int[] arr2) {
//		// TODO Auto-generated method stub
//		int length = 0;
//		arr2[arr2.length - 1] = arr[0];
//		for (int i = 1; i < arr.length; i++) {
//			arr2[length] = arr[i];
//			length++;
//		}
//		System.out.println("After shifting");
//		for (int num : arr2) {
//			System.out.print(num + " ");
//		}
//
//	}
}
