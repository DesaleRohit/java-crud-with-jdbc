package com.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

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
}
