package program.int007.java;

public class FactorialRecurrsion {
	public static void main(String[] args) {
		int num = 5;
		System.out.println(factorial(num));
	}

	private static int factorial(int num) {
		// TODO Auto-generated method stub
		if (num == 0) {
			return 1;
		}
		return num * factorial(num - 1);
	}
}
