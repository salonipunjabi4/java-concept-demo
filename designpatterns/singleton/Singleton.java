package com.designPatterns;

public class Singleton implements Cloneable{
	private volatile static Singleton _instance;
	
	private Singleton() {
		//preventing singleton object instantiation from outside
	}
	/*
	 * 1st version: creates multiple instance if two thread access * this method
	 * simultaneously
	 */
	
	public static Singleton getInstance() {
		if(_instance == null) {
			_instance = new Singleton();
		}
		return _instance;
	}
	
	/*
	 * 2nd version: this is thread safe and only * creates one instance of Singleton on concurrent environment *
	 * but unnecessarily expensive due to cost of synchronization * at every call
	 */
	public static synchronized Singleton getInstanceTS() {
		if(_instance == null) {
			_instance = new Singleton();
		}
		return _instance;
	}
	
	/*
	 * 3rd version: An implementation of double checked locking of Singleton. 
	 * Intention is to minimize cost of synchronization and improve performance, by only locking critical section
	 * of code, the code which creates instance of Singleton class. By the way this is still broken, if we don't make'_instance volatile, as another
	 * thread can see a half initialized instance of Singleton
	 * but unnecessarily expensive due to cost of synchronization * at every call
	 */
	public static Singleton getInstanceDC() {
		if(_instance == null) {
			synchronized(Singleton.class) {
				if(_instance == null) {
					_instance = new Singleton();
				}
			}
		}
		return _instance;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		//Here forcibly throws the exception for preventing to be cloned
		throw new CloneNotSupportedException();
		//it is compulsory to throw exception here else it will allow to create clone
		//return super.clone();
	}
	
	void test() {
		System.out.println("Hello Singleton Test");
	}
	
}
