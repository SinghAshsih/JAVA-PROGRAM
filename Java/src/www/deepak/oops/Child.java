package www.deepak.oops;

public class Child extends Parent {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.x = 8;
		p.m1();
		p.m1();
		System.out.println(p.x);
	}

}
