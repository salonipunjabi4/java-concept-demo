package com.designPatterns;

class Address{
	private int id;
	private String city;
	private String state;
	private static Address address;
	private Address() {
		//address = new Address();
	}
	public static Address getInstance() {
		if(address == null) {
		address = new Address();
	}
		return address;
	
	}
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

}

public class MySingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address a1 = Address.getInstance();
		Address a2 = Address.getInstance();
		Address a3 = Address.getInstance();
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(a3.hashCode());
		

	}

}
