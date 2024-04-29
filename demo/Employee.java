package com.demo;

class Employee{
	int id;
	String name;
	String address;
	String mobileNo;
	static int totalEmployee;
	
	Employee(int id, String name, String address, String mobileNo){
		
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
	public static int getEmployee() {
		return totalEmployee++;
	}
}

