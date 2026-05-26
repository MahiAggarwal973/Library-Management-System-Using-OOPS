# Library Management System using oops

A simple console-based Library Management System developed using Java and Object-Oriented Programming (OOP) concepts.

This project manages:
- Books in the library
- Students who borrow books
- Librarian operations
- Book issue and return process

---

# OOP Concepts Used

## 1. Class and Object
Classes used:
- Book
- Student
- Librarian
- Library
- Person

Objects are created from these classes.

---

## 2. Encapsulation
Data members are declared private and accessed using getters and setters.

Example:
```java
private int bookId;
private String bookName;
```

---

## 3. Inheritance

```plaintext id="1mw5hk"
Person
│
├── Student
├── Librarian
```

- Student extends Person
- Librarian extends Person

---

## 4. Polymorphism
Method overriding is used.

Example:
```java
displayDetails()
```

Different implementations:
- Student displayDetails()
- Librarian displayDetails()

---

## 5. Abstraction
Interface used:
```java
LibraryOperations
```

Methods:
- issueBook()
- returnBook()

Implemented in:
```java
Library
```

---

## 6. Constructors
Constructors are used for object initialization.

Examples:
```java
Book(int id, String name, String author)
Student(int id, String name, String department)
```

---

## 7. Exception Handling
Handled exceptions:
- Book not found
- Invalid student ID
- Book already issued
- Borrow limit exceeded
- Returning non-issued book

---

# Features

- Add Book
- View Books
- Add Student
- Issue Book
- Return Book
- View Student Details

---

# Rules Implemented

## Book Issue Rules
- A student can borrow maximum 3 books
- Already issued books cannot be issued again

## Return Rules
- Students can return only borrowed books

---

# Project Structure

```plaintext id="zxtv8h"
LibraryManagementSystem/
│
├── Person.java
├── Student.java
├── Librarian.java
├── Book.java
├── LibraryOperations.java
├── Library.java
├── Main.java
```

---

# Functional Flow

```plaintext id="ph8coc"
1. Add Book
2. View Books
3. Add Student
4. Issue Book
5. Return Book
6. View Student Details
7. Exit
```

---

# How to Run the Project

## Step 1
Open the project folder in VS Code.

---

## Step 2
Compile all Java files:

```bash
javac *.java
```

---

## Step 3
Run the project:

```bash
java Main
```

---

# Sample Output

```plaintext id="xk61yh"
===== LIBRARY MANAGEMENT SYSTEM =====

1. Add Book
2. View Books
3. Add Student
4. Issue Book
5. Return Book
6. View Student Details
7. Exit
```

---

# Author

Mahi Aggarwal

GitHub:
https://github.com/MahiAggarwal973
