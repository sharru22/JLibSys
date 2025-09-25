# JLibSys
Java Library Management System using OOP Concepts

📖 Overview

JLibSys is a mini Library Management System built in Java demonstrating core Object-Oriented Programming (OOP) principles such as Abstraction, Encapsulation, Inheritance, and Polymorphism.
It allows managing books and users, issuing and returning books, and viewing available books efficiently.

🚀 Features

Add books to the library
Add users to the system
Issue books to users (prevents double-issuing)
Return books
Display all available books
Keep track of issued books per user

🛠 Tools & Technologies

Java 17+
VS Code / IntelliJ IDEA
Terminal / Command Prompt

📌 Concepts Implemented

Abstraction – User and Book classes hide internal implementation details
Encapsulation – Private fields with getters/setters
Inheritance – Can extend User class for specialized users
Polymorphism – Overridden toString() methods
Constructor Chaining – Using this() and super()
Dynamic Binding – Runtime method overriding

💻 How to Run

Clone the repository:
git clone https://github.com/yourusername/JLibSys.git
cd JLibSys


Compile all Java files:

javac *.java
Run the program:
java Main

📂 Project Structure
JLibSys/
 ├── Book.java
 ├── User.java
 ├── Library.java
 └── Main.java

📌 Sample Output
Java Basics added to the library.
Effective Java added to the library.
Clean Code added to the library.
User Sharmin added to the library system.
User Rahul added to the library system.
Java Basics has been issued.
Sorry, Java Basics is already issued to someone else.
Java Basics has been returned.
Java Basics has been issued.

Available Books:
Book ID: 2, Title: Effective Java, Author: Joshua Bloch, Issued: false
Book ID: 3, Title: Clean Code, Author: Robert C. Martin, Issued: false

📌 Future Improvements
Track books issued per user
Add GUI using JavaFX or Swing
Integrate file/database storage for persistent data
Search books by title/author

~Thnakyou for checking out!
