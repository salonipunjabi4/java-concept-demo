package com.thread;

public class DeadLockTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DeadLockTest test = new DeadLockTest();
		final A a = test.new A(); // because A is inner class of DeadLockTest
		final B b = test.new B(); // because A is inner class of DeadLockTest
		
		Runnable block1 = new Runnable() {
			public void run() {
				synchronized(a) {
					try {
						System.out.println("Block-1 Start");
						//adding delay so that both threads can start trying to lock resource
						Thread.sleep(100);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
					//Thread-1 have A but need B also
					synchronized (b) {
						System.out.println("In block 1 end");
					}
				}
			}
		};
		
		//Thread-2
		Runnable block2 = new Runnable() {
			public void run() {
				synchronized(a) {
					System.out.println("Block 2 start ");
					//Thread-2 have B but need A also
					synchronized(b) {
						System.out.println("In block 2 end");
					}
				}
			}
		};
		new Thread(block1).start();
		new Thread(block2).start();
		System.out.println();

	}
	
	//Resource A
	private class A { //inner class
		private int i = 10;
		
		public int getI() {
			return i;
		}
		public void setI(int i) {
			this.i = i;
		}
	}

	
	//Resource A
	private class B { //inner class
		private int i = 20;
		
		public int getI() {
			return i;
		}
		public void setI(int i) {
			this.i = i;
		}
	}
}
