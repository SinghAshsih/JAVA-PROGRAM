package program.int007.java;

public class EvenAndOddDigitCount {
	public static void main(String[] args) {
		int num = 222222;
		count(num);
	}

	private static void count(int num) {
		// TODO Auto-generated method stub
		int evenCount = 0;
		int oddCount = 0;
		while (num > 0) {
			int digit = num % 10;
			if (digit % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
			num /= 10;
		}
		System.out.println("EvenCount " + evenCount);
		System.out.println("OddCount  " + oddCount);
	}
}
