package com.demo;


public class B {

	static {
		System.out.println("static block");
	}
	{
		System.out.println("IIB1");
	}

	B() {
		//this(10);
		
		// IIB calling statement
{
		System.out.println("IIB");
	}		System.out.println(" B Constructor");

	}

	B(int x) {
		System.out.println(x);
	}

	

	public static void main(String[] args) {
		System.out.println("main");
		B b1 = new B();
		//B b2 = new B(10);
	}
}


