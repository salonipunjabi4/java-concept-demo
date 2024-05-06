package com.collection;

import java.util.Comparator;

public class IdComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getId().compareTo(o2.getId());
	}

}
