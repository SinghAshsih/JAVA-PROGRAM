package program.int007.java;

public class MissingNumberInAnArray {
	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 6, 7, 8 };

		missingNumber(num, 8);

	}

	private static void missingNumber(int[] num, int n) {
		// TODO Auto-generated method stub
		int totalSum = n * (n + 1) / 2;
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		int missingNum = totalSum - sum;
		System.out.println(missingNum);
	}
}
