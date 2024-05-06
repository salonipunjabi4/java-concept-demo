package com.thread;

class MyThread6 extends Thread {
	public void run() {
		for(int i = 0; i< 10; i++) {
			System.out.println("Child Thread");
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				
			}
		}
	}
}

public class MyJoinExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MyThread6 t = new MyThread6();
		MyThread6 t1 = new MyThread6();
		
		t.start();
		t1.start();
		t.join(); // main thread will wait for child thread to complete its execution, join will stop the execution of current thread
		
		for(int i = 0; i<10; i++) {
			System.out.println("Main Thread");
		}
	}

}
