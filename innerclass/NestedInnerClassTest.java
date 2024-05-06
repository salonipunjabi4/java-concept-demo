package com.innerclass;

class Outer{
	private Integer x = 100;
	class Inner{
		void test() {
			System.out.println(x);
		}
	}
}

public class NestedInnerClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer.Inner o = new Outer().new Inner();
		o.test();
		
		
		
	}

}
