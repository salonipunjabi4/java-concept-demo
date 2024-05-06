package com.innerclass;
class Outer1 {
	void test() {
		System.out.println("inside method");
		class Inner1{
			void test1() {
				System.out.println("inside method inner class");
			}
		}
		Inner1 i = new Inner1();
		i.test1();
	}
}
public class MethodLocalInnerClass {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outer1 o1 = new Outer1();
		o1.test();
		

	}

}
