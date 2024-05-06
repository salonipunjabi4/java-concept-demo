package com.exception;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//			//Class.forName(""); //it is a way to create instance using reflection API
//			
//			String str = null;
//			System.out.println(str.length());
//			
//			int arr[] = {1,2,3,4,5};
//			System.out.println(arr[10]);
//	
//			//e.printStackTrace();
//			System.out.println(e.getMessage());
//			
//	
//		
//		System.out.println("Line 1");
//		System.out.println("Line 2");
//		
		
//		int result = print();
//		System.out.println(result);
		
		String x = "abc";
		int result = Integer.parseInt(x);
		System.out.println(result);
		


	}
	static int print() {
		try {
			String str = null;
			System.out.println(str.length());
			return 0;
		}
		catch(Exception e) {
			return 1;
		}finally {
			System.out.println("Hello");
			//return 2;
		}
	}
	

}
