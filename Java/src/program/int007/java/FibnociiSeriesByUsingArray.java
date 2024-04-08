package program.int007.java;

public class FibnociiSeriesByUsingArray {
	public static void main(String[] args) {
		int count = 10;
		int[] arr = new int[count];
		arr[0] = 0;
		arr[1] = 1;
		for (int i = 2; i < count; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
