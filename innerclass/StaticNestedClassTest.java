package com.innerclass;

class Outer2{
	void test() {
		System.out.println("inside test");
	}
	
	static class Inner2{
		public static void test1() {
			System.out.println("inside test1");
			Outer2 o = new Outer2();
			o.test();
		}
	}
}

public class StaticNestedClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outer2.Inner2.test1();

	}

}
