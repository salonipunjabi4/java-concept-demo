package com.stringhandling;

public class MyStringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str2 = new String("Hello");
		String str3 = new String("Hello");
		System.out.println(str2.equals(str3));
		
		System.out.println(str2==str3);
		
		Employee e1 = new Employee("Hello");
		Employee e2 = new Employee("Hello");
		
		System.out.println(e1.equals(e2));
		
		System.out.println(e1==e2);
		
		String str = new String("hello");
		String str1 = str.concat("five");
		System.out.println(str + " " + str1);
		
		StringBuffer sb = new StringBuffer("Hlo");
		StringBuffer sb1 = sb.append("welcome");
		System.out.println(sb +" "+ sb1);
		

	}

}
