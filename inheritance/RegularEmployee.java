package com.inheritance;

public class RegularEmployee extends Employee {
	
	private double montlySalary;

	public RegularEmployee() {
		super();
	}
	public RegularEmployee(int monthlySalary) {
		super();
		this.montlySalary = monthlySalary;
	}

	public double getMontlySalary() {
		return montlySalary;
	}

	public void setMontlySalary(double montlySalary) {
		this.montlySalary = montlySalary;
	}
	

}
