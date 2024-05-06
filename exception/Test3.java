package com.exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test3 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		File f2 = new File("C://abc/anc.txt");
		FileWriter out = new FileWriter(f2);
		try {
		Class.forName("demo");
		}
		catch(ClassNotFoundException e) {
			
		}finally {
			
		}
		
		try {
			Class.forName("demo");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			
		}
		System.out.println("Finish");

		
		File f = new File("abc.txt");
		try {
			FileWriter f1 = new FileWriter(f);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
//		try {
//			Class.forName(null);
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
