package com.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.student.db.DatabaseConnection;
import com.student.model.Student;

public class StudentDAO {
	//ADD Student
	public void addStudent(Student s) {
		try {
			Connection connection = DatabaseConnection.getConnection();
			String query = "INSERT INTO students(name, age, email) VALUES(?,?,?)";
			PreparedStatement ps = connection.prepareStatement(query);
			
			ps.setString(1, s.getName());
			ps.setInt(2, s.getAge());
			ps.setString(3, s.getEmail());
			
			ps.executeUpdate();
			System.out.println("Student Added!");
			
			ps.close();
			connection.close();
			
		} catch (Exception e) {
			System.out.println("Error Adding Student!!!");
		}
	}
	
	public void viewStrudents() {
		try {
			Connection connection = DatabaseConnection.getConnection();
			Statement statement = connection.createStatement();
			String query = "SELECT * FROM students";
			ResultSet resultSet = statement.executeQuery(query);
			
			System.out.println("ID  | Name     | Age  | Email");
			System.out.println("---------------------------------------");

			while (resultSet.next()) {
			    System.out.println(
			        resultSet.getInt("id") + "    " +
			        resultSet.getString("name") + "    " +
			        resultSet.getInt("age") + "    " +
			        resultSet.getString("email")
			    );
			}
		
			resultSet.close();
			statement.close();
			connection.close();
			
		} catch (Exception e) {
			System.out.println("Error Fetching Students!!!");
		}
	}
	
	public void search(int id) {
		try {
		Connection connection = DatabaseConnection.getConnection();
		String query = "SELECT * FROM students WHERE id=?";
	    PreparedStatement pst = connection.prepareStatement(query);
	    pst.setInt(1, id);
	    ResultSet resultSet = pst.executeQuery();
	    
	    
	    if(resultSet.next()) {
	    	System.out.println("ID: " + resultSet.getInt("id"));
            System.out.println("Name: " + resultSet.getString("name"));
            System.out.println("Age: " + resultSet.getInt("age"));
            System.out.println("Email: " + resultSet.getString("email"));
	    } else {
	    	System.out.println("Student Not-found!!!");
	    }
	    
		} catch (Exception e) {
			System.out.println("Error to search student!!!");
		}
	}
	
}
