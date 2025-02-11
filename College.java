package com.tkahomework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class College {
	
	void collegeInsertData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		Statement s = c.createStatement();
		s.executeUpdate("insert into college values('JSPM','Hadapsar',4);");
		System.out.println("Data inserted successfully...");
		c.close();
	}
	
	void collegeUpdateData() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		Statement s = c.createStatement();
		s.executeUpdate("update college set address='Deccan' where sr=3");
		System.out.println("Data updated successfully...");
		c.close();
	}
	
	void collegeDeleteData() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		Statement s = c.createStatement();
		s.executeUpdate("delete from college where sr=4");
		System.out.println("Data deleted successfully...");
		c.close();
	}
	
	void collegeFetchData() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		Statement s = c.createStatement();
		ResultSet rs = s.executeQuery("select * from college;");
		while(rs.next()) {
			System.out.println(rs.getInt(3)+" | "+rs.getString(1)+" | "+rs.getString(2));
		}
		System.out.println("Data fetched successfully...");
		c.close();
	}

	public static void main(String[] args) throws Exception{
		College c = new College();
		c.collegeInsertData();
		c.collegeUpdateData();
		c.collegeDeleteData();
		c.collegeFetchData();

	}

}
