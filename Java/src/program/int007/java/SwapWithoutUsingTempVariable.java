package program.int007.java;

public class SwapWithoutUsingTempVariable {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("Before Swapping ");
		System.out.println(a);
		System.out.println(b);
		swap(a, b);
	}

	private static void swap(int a, int b) {
		// TODO Auto-generated method stub
		a = a * b;
		b = a / b;
		a = a / b;
		System.out.println("After swapping ");
		System.out.println(a);
		System.out.println(b);
	}
}
