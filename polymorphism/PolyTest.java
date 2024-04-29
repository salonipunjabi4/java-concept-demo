package com.demo.poly;

public class PolyTest {
	void test() {
		System.out.println("test 1");
	}
	void test(int x) {
		System.out.println(x);
	}
	int test(String msg) {
		System.out.println(msg);
		return 100;
	}
	public static void main(String[] args) {
		PolyTest p = new PolyTest();
		p.test("test");
		p.test();
		p.test(100);
	}

}
