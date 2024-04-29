package com.inheritance;


class Employee{
	private int id;
	private String name;
	private String address;
	private String mobileNo;
	
	
	
	
	public Employee(int id, String name, String address, String mobileNo) {
		
		this.id = id;
		this.name = name;
		this.address = address;
		this.mobileNo = mobileNo;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getMobileNo(){
		return mobileNo;
	}
	
}

