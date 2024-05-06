package com.exception;

public class Test4 {

	public static void main(String[] args) throws AgeNonNegativeException {
		// TODO Auto-generated method stub
		int age = -1;
		if(age <= 0) {
			throw new AgeNonNegativeException("Age can not be negative or zero");
		}
		System.out.println("Your age=" + age);

	}

}
