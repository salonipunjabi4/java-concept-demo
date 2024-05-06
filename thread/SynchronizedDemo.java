package com.thread;

public class SynchronizedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display d = new Display();
		MyThread13 t1 = new MyThread13(d, "Allen");
		MyThread13 t2 = new MyThread13(d, "Black");
		t1.start();
		t2.start();

	}

}
