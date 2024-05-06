package com.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MySetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set = new LinkedHashSet();
		set.add("xyz");
		set.add(null);
		set.add("pre");
		set.add("yuh");
		System.out.println(set);
		
		Set<Employee> employees = new HashSet<>();
		
		Employee e1 = new Employee(101, "Allen", 234f, "NY");
		Employee e2 = new Employee(10, "Allen", 234f, "NY");
		
		employees.add(e1);
		employees.add(e2);
		System.out.println(employees);
		
		System.out.println(e1.hashCode() + "," + e2.hashCode());
		
		Set<Employee> set1 = new TreeSet<>(new NameComparator());
		

		set1.add( new Employee(101, "Back", 234f, "Pitts"));
		set1.add( new Employee(102, "Allen", 234f, "Pitts"));
		System.out.println(set1);
		

	}

}
