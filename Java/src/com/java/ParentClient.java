package com.java;

public class ParentClient {
	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();
		Parent pc = new Child();
//		p.m1();
//		p.m2();
//		c.m1();
//		c.m2();
//		c.m3();
//		pc.m4();
		pc.m1();
		pc.m2();
		pc.m4();
		
	}
}
