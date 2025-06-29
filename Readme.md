# 📚 Mini Library Management System (Java)

A simple multi-class Java project to manage books and users in a small library. Built using basic Java concepts with a terminal interface.

##  Features

- Add sample books and users
- View available books and registered users
- Issue a book to a user (1 book per user limit)
- Return a book
- Simple menu-driven console UI

##  Project Structure
ibrarySystem/
├── Book.java // Book class: title, author, issued status
├── User.java // User class: name, borrowed book
├── Library.java // Library class: stores books and users
└── Driver.java // Entry point with interactive menu

Compile all .java files:
javac Driver.java


Run the program:

java Driver


 Sample Output
--- Library Menu ---
1. View Books
2. View Users
3. Issue Book
4. Return Book
0. Exit
Enter choice: 1

Library Books:
The Alchemist by Paulo Coelho [Available]
1984 by George Orwell [Available]