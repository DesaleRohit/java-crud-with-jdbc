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
			System.out.println("\n");
			System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
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
            } else if (ch == 2) {
            	dao.viewStrudents();
            } else if (ch == 3) {
            	System.out.print("Enter ID: ");
                dao.search(scanner.nextInt());
            } else if (ch == 4) {
                System.out.print("ID : ");
                int id = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Name : ");
                String name = scanner.nextLine();

                System.out.print("Age : ");
                int age = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Email : ");
                String email = scanner.nextLine();

                dao.update(new Student(id, name, age, email));
            }
		}
	}

}
