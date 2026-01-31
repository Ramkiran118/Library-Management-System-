# 📚 Library Management System (Java)

A **console-based Library Management System** built using **Core Java and Object-Oriented Programming (OOP)** concepts.  
This project allows users to **add books, borrow and return items, and manage library records** through a menu-driven interface.

---

## 🚀 Features

- Add books to the library
- Borrow and return books
- Role-based users:
  - **Student** (can borrow only books)
  - **Professor** (can borrow books and magazines)
- Book availability tracking
- Display all books in the library
- Display borrowed items
- Menu-driven console interaction using `Scanner`
- Clean OOP-based design

---

## 🧠 OOP Concepts Used

- Encapsulation
- Inheritance
- Polymorphism
- Abstraction
- Interfaces
- Method Overriding
- Composition
- Packages

---

## 🗂️ Project Structure

```
com.librarymanagementsystem
│
├── Main.java
├── Author.java
├── LibraryItem.java
├── Book.java
├── Magazine.java
├── User.java
├── Student.java
├── Professor.java
├── Library.java
└── BookOperations.java
```

---

## 🧩 Class Overview

### Author
Stores author details such as name, biography, number of books published, and age.

### LibraryItem
Base class for all library items.  
Handles borrowing, returning, and availability.

### Book
Extends `LibraryItem`.  
Contains an `Author` object.

### Magazine
Extends `LibraryItem`.  
Includes issue number details.

### User
Base class for library users.  
Supports borrowing and returning items.

### Student
Extends `User`.  
Can borrow **only books**.

### Professor
Extends `User`.  
Can borrow books.

### Library
Manages book collection.  
Implements `BookOperations`.

### BookOperations (Interface)
- `addBook(Book book)`
- `removeBook(String itemId)`
- `displayDetails()`

---

## 🖥️ How to Run the Project

### 🔧 Requirements
- Java JDK 8+
- Any Java IDE or Command Prompt

---

### ▶️ Compile and Run

```bash
javac com/librarymanagementsystem/*.java
java com.librarymanagementsystem.Main
```

---

## 📋 Sample Menu

```
---- Library Menu ----
1. Add Book
2. Borrow Book
3. Return Book
4. Show Borrowed Items
5. Display Library Books
6. Exit
```

---

## 🧪 Sample Output

```
Java Book borrowed successfully.
Student can only borrow books.
Java Book returned successfully.

List of books in Library:
Book{title='Java Book', itemId='Java123', author='Java Creator'}
```

---

## 🛠️ Future Enhancements

- Support multiple users
- Replace arrays with `ArrayList`
- File handling (save/load data)
- Database integration (MySQL)

---

## 👨‍💻 Author

**Ram Kiran**  
Java Developer | OOP Enthusiast

---

## ⭐ Support

If you find this project helpful, give it a ⭐ on GitHub!
