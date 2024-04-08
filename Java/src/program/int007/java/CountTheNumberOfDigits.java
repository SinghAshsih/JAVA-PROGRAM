package program.int007.java;

public class CountTheNumberOfDigits {
	public static void main(String[] args) {
		int num = 344346;
		int count = 0;
		while (num > 0) {
			num /= 10;
			count++;
		}
		System.out.println("No.of digit is  " + count);

		System.out.println("--------------------------------------------------");
		int numm = 987892;
		int result = recursionCount(numm);
		System.out.println("No.of digit is  " + result);
		int num3 = 989898;
		System.out.println("----------------------------------------------------");
		System.out.println("No. of digit is " + String.valueOf(num3).length());

	}

	private static int recursionCount(int numm) {
		// TODO Auto-generated method stu
		if (numm == 0) {
			return 0;
		}

		return 1 + recursionCount(numm / 10);
	}
}
