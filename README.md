# Student Management System (Learning Project)

This repository contains a simple **Student Management System** console application built using:

- Java (Core)
    
- JDBC
    
- MySQL Database
    

> **Note:**  
> This project is created only for **my learning and practice**.  
> It is **not** a production-ready application and there is **no need for anyone to clone or use it** as a real application.  
> The code may contain basic implementations and temporary logic used while learning JDBC.

---

## ✨ Features (for learning)

✅ Add Student  
✅ Update Student  
✅ Delete Student  
✅ View Single / All Students  
✅ JDBC CRUD Operations  
✅ Clean Folder Structure (DAO, Model, Database Connection)

---

## 📁 Project Structure

```
src/
├── com/
│   └── student/
│       ├── dao/
│       │   └── StudentDAO.java
│       ├── db/
│       │   └── DatabaseConnection.java
│       ├── main/
│       │   └── MainApp.java
│       └── model/
│           └── Student.java
└── src/
```

## 🛠️ Technologies Used

- Java (Core)
    
- JDBC API
    
- MySQL Database
    

    

---

## 🎯 Why this repo exists?

I created this project to learn and practice:

- How JDBC works
    
- How to connect Java with MySQL
    
- Performing CRUD operations using PreparedStatement
    
- Understanding DAO & Model structure
    
- Basic console-based backend logic

---

## 🚀 How to Run This Project

1. Install Java & MySQL
    
2. Create a database

```sql
CREATE DATABASE College_db;
```

3. Create a table:

```sql
CREATE TABLE students(
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50),
    age INT,
    email VARCHAR(100)
);
```

4. Update your MySQL username/password in `DatabaseConnection.java`.
    
5. Run `MainApp.java` from your IDE or terminal.
