package com.stringhandling;

import java.util.Objects;

public class Employee {
	private String str;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String str) {
		super();
		this.str = str;
	}

	@Override
	public int hashCode() {
		return Objects.hash(str);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(str, other.str);
	}
	
	

}
