package com.demo;

class Test {
	public static void test() {
		System.out.println("Test test ");
	}

}

public class MyClass {
	public static void test() {
		System.out.println("MyClass test");
	}

	public static void main(String[] args) 
	{// JVM will start execution
		System.out.println("main");
		test(); // call of test method
		// test();
		Test.test();

	}// JVM will end execution
}
