package program.int007.java;

public class SumOfString {
	public static void main(String[] args) {
		String n1 = "222";
		String n2 = "333";
		int sum = Integer.parseInt(n1) + Integer.parseInt(n2);
		System.out.println(sum);
		String sum2 = String.valueOf(sum);
		System.out.println(n1 + " + " + n2 + " = " + sum2);

	}
}
