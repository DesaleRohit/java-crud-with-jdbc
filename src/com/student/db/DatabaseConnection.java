package com.student.db;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	static final String URL = "jdbc:mysql://localhost:3306/College_db";
	static final String USERNAME = "root";
	static final String PASSWORD = "root";
	
	public static Connection getConnection() {
		Connection connection = null;
		try {
			//Step 1. Register MYSQL Driver.. 
			Driver driver = new com.mysql.cj.jdbc.Driver();
		    DriverManager.registerDriver(driver);
		    
		    //Step 2. Create connection..
		    connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
		    System.out.println("Database connected successfully!");
			
		} catch (SQLException e) {
			System.out.println("Database connection failed!");
			e.printStackTrace();
		}
		
		return connection;
	}
}
