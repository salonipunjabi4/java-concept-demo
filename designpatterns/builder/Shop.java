package com.builder;

public class Shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Phone phone1 = new PhoneBuilder().setOs("Android").setCamera(20).build();
		System.out.println(phone1);
		
		Phone phone2 = new PhoneBuilder().setOs("Android").setCamera(5000).build();
		System.out.println(phone2);
		
		Phone phone3 = new PhoneBuilder().setOs("Android").setBattery(5000).setCamera(20).build();
		System.out.println(phone3);
		
		Phone phone4 = new PhoneBuilder().setOs("iOS").setScreenSize(6).build();
		System.out.println(phone4);
		
		//It is simplifying object creation process with optional parameter

	}

}
