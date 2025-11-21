package com.student.main;

import java.util.Scanner;
import com.student.dao.StudentDAO;
import com.student.model.Student;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to CRUD Operation project");
		
		Scanner scanner = new Scanner(System.in);
		StudentDAO dao = new StudentDAO();
		
		while (true) {
			
			System.out.println("\n1. Add");
            System.out.println("2. View All");
            System.out.println("3. Search");
            System.out.println("4. Update");
            System.out.println("5. Delete");
            System.out.println("6. Exit");
            System.out.print("Choice: ");
            
            int ch = scanner.nextInt();
            
            if (ch == 1) {
            	scanner.nextLine();
            	System.out.println("Name : ");
            	String name = scanner.nextLine();
            	System.out.println("Age : ");
            	int age = scanner.nextInt();
            	scanner.nextLine();
            	System.out.println("Email : ");
            	String email = scanner.nextLine();
            	
            	dao.addStudent(new Student(name, age, email));
            }
		}
	}

}
