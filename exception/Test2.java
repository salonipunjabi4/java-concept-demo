package com.exception;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestInterface i = new MyClass(); //up casting
		MyClass m = new MyClass();
		m = (MyClass)i; //down casting
		m.test();
		
		Child c = (Child) new Parent();
		c.test();

	}

}
