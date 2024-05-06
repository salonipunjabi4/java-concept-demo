package com.collection;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapExample {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		Map<Employee, String> weakmap = new WeakHashMap<>();
		Employee e = new Employee(101, "Allen", 789f, "NJ");
		weakmap.put(e,  "Hello");
		
		System.out.println(weakmap);
		e = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(weakmap);

	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize called");
	}

}
