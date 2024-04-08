package program.int007.java;

public class BestTimeToBuyStock {
	public static void bestTimeToBuyStock() {
		int[] arr = { 10, 20, 30, 40, 100 };
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min=arr[i];
			}
			if (arr[i] - min > max) {
				max = arr[i] - min;
			}

		}
		System.out.println("Best time to buy stock = " + max);
	}

	public static void main(String[] args) {
		bestTimeToBuyStock();
	}
}
