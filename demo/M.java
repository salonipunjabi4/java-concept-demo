package com.demo;

class L {
	{
		System.out.println("IIB1");
	}
	{
		System.out.println("IIB2");
	}
	static {
		System.out.println("SIB1");
	}
	static {
		System.out.println("SIB2");
	}

	L() {
		System.out.println("constructor");
	}

	L(int i) {
		System.out.println("L(int");
	}

	L(int i, int j) {
		System.out.println("L(int,int)");
	}
}

public class M extends L{
	M() {
		System.out.println("Constructor of M class");
	}
	{
		System.out.println("IIB3");
	}
	{
		System.out.println("IIB4");
	}

	public static void main(String[] args) {
		M m1 = new M();
	}

}