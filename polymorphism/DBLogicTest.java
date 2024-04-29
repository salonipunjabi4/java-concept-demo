package com.demo.poly;

public class DBLogicTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBLogic mongo = new MongoDB();
		DBLogic mysql = new MYSQLDB();
		mongo.save();
		mongo.find();
		mongo.update();
		mongo.delete();
		mysql.save();
		mysql.find();
		mysql.update();
		mysql.delete();
		

	}

}
