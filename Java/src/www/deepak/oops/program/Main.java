package www.deepak.oops.program;

public class Main {
	public static void main(String[] args) {
		ChildClass cl = new ChildClass();
		cl.m1();
		cl.sub();
		cl.sum();
		cl.marry();

		System.out.println(cl.age);
		System.out.println(cl.name);

		System.out.println("--------------------");
		ParentClass p = new ParentClass();
		p.sum();
		p.sub();
		System.out.println(p.age);
		System.out.println(p.name);

		System.out.println("-----------------------");

		ParentClass p2 = new ChildClass();
		p2.marry();
		p2.sub();

		System.out.println("--------------------");
//	
	}
}
