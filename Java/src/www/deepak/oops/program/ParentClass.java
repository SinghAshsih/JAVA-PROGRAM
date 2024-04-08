package www.deepak.oops.program;

public class ParentClass {
	int age = 45;
	static String name = "Manoj";

	public void marry() {
		System.out.println("Katrina");
	}

	public void sum() {
		int a = 9;
		int b = 8;
		int sum = a + b;
		System.out.println(sum);
	}

	public void sub() {
		int a = 45;
		int b = 23;
		int sub = a - b;
		System.out.println(sub);
	}
}

class ChildClass extends ParentClass {
	int age = 23;
	static String name = "Deepak";

	@Override
	public void marry() {
		System.out.println("Ashwariya");
	}

	public void m1() {
		System.out.println("Hi i am from child");
	}
}
