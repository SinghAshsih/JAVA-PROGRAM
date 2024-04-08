package program.int007.java;

public class FindTheLargestOfThreeNumber {
	public static void main(String[] args) {
		int largest = largest();
		System.out.println("Largest is " + largest);
	}

	private static int largest() {
		// TODO Auto-generated method stub
		int num1 = 542, num2 = 542, num3 = 54;
		if (num1 > num2 && num1 > num3) {
			return num1;
		} else if (num2 > num1 && num2 > num3) {
			return num2;
		} else if (num3 > num1 && num3 > num2) {
			return num3;
		} else {
			return -1;
		}

	}
}
