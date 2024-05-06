package com.thread;

public class Display {
	public synchronized void wish(String name) {
		for(int i = 0; i< 10; i++) {
			System.out.print("Hello.....!");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				
			}
			System.out.println(name);
		}
	}

}
