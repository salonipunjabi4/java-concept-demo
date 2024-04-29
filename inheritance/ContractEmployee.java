package com.inheritance;

public class ContractEmployee extends Employee{
	private int noOfHours;
	
	public ContractEmployee(){
		super();
		
	}
	public ContractEmployee(int noOfHours){
		super();
		this.noOfHours = noOfHours;
		
	}
	
	
	public int getNoOfHours() {
		return noOfHours;
	}



	public void setNoOfHours(int noOfHours) {
		this.noOfHours = noOfHours;
	}
	
	

}
