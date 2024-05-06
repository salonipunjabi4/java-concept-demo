package com.innerclass;

public class Test1 {
	static int x = 100;
	int x1 = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t = new Test1();
		System.out.println(x);
		System.out.println(t.x1);

	}

}
//non static property can not be accessible in static method directly
// we have to create object of class