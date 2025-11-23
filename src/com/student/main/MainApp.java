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
            scanner.nextLine();   // Clear buffer

            switch (ch) {

                case 1:  // ADD
                    System.out.print("Name : ");
                    String name = scanner.nextLine();

                    System.out.print("Age : ");
                    int age = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Email : ");
                    String email = scanner.nextLine();

                    dao.addStudent(new Student(name, age, email));
                    break;

                case 2:  // VIEW ALL
                    dao.viewStudents();
                    break;

                case 3:  // SEARCH
                    System.out.print("Enter ID: ");
                    int searchId = scanner.nextInt();
                    dao.search(searchId);
                    break;

                case 4:  // UPDATE
                    System.out.print("ID : ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Name : ");
                    String newName = scanner.nextLine();

                    System.out.print("Age : ");
                    int newAge = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Email : ");
                    String newEmail = scanner.nextLine();

                    dao.update(new Student(id, newName, newAge, newEmail));
                    break;

                case 5:  // DELETE
                    System.out.print("Enter ID to DELETE student : ");
                    int deleteId = scanner.nextInt();
                    dao.delete(deleteId);
                    break;

                case 6:  // EXIT
                    System.out.println("Bye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid Choice!");
                    break;
            }
		}
	}

}
