package com.project.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.io.*;

public class TestJDBC {

	public static void main(String[] args) {
		/*
		String jdbcUrl = "jdbc:mysql://localhost:3306/project_books_info?useSSL=false&serverTimezone=UTC";
		String user = "jac2020ipd22";
		String pass = "jac2020ipd22";
		*/
		
		
		
		//String jdbcUrl = "jdbc:mysql://alex-mysql-test.mysql.database.azure.com:3306/users?useSSL=true&requireSSL=false";	
		String jdbcUrl = "jdbc:mysql://localhost:3306/users?useSSL=false&serverTimezone=UTC";	
		String user = "root";
		String pass = "rootHoHoHo";	
		
				
		try {System.out.println("Connecting to database: " + jdbcUrl);
			Connection myConn = DriverManager.getConnection(jdbcUrl,user,pass);
			System.out.println("Connection Sucessful!!!");		}
		catch(Exception exc){exc.printStackTrace();}		
		
		System.out.println("Hello World!");
	}
	
}

