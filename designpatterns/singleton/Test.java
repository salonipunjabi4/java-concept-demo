package com.designPatterns;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Singleton s = Singleton.getInstanceDC();
		Singleton s1 = (Singleton) s.clone();
		//Singleton s1 = Singleton.getInstance();
		s.test();

	}

}
