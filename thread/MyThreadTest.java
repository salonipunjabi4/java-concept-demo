package com.thread;

public class MyThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread1 m = new MyThread1();
		Thread t1 = new Thread(m);
		t1.start();
		for(int i = 20; i<= 30; i++) {
			System.out.println(i);
		}
	}

}
