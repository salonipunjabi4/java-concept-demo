package com.innerclass;

interface MyInterface{
	void test();
}

public class AnonymousInnerClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyInterface mi = new MyInterface() {

			@Override
			public void test() {
				// TODO Auto-generated method stub
				System.out.println("Anonymous inner class");
			}
			
		};
		mi.test();
	}

}
