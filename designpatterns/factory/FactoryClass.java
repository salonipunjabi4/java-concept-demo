package com.designpattern.factory;

public class FactoryClass {
	
	public Employee getEmployee(String employee) {
		if(employee == null) {
			return null;
		}else if(employee.equalsIgnoreCase("software")) {
			return new Software();
		}else if(employee.equalsIgnoreCase("Permanant")) {
			return new Permanent();
		}else if(employee.equalsIgnoreCase("Contract")) {
			return new Contract();
		}else {
			return null;
		}
	}

}
