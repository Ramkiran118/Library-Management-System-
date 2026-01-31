package com.librarymanagementsystem;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();


        // creating Student

    
        System.out.print("Enter Student ID :");
        String StudentId = sc.nextLine();
        System.out.print("Enter Student Name :");
        String StudentName = sc.nextLine();

        Student student = new Student(StudentId, StudentName);



        //Creating Professor

        System.out.print("Enter the Professor Id :");
        String ProfId = sc.nextLine();
        System.out.print("Enter Professor Name :");
        String ProfessorName = sc.nextLine();

        Professor professor = new Professor(ProfId, ProfessorName);




        while(true){

            System.out.println("\n ---- Library Menu ----");
            System.out.println("1. Add Book");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Show Borrow Items");
            System.out.println("5. Display Library Books");
            System.out.println("6. Exit");

            System.out.println("The books in Library are :");
            library.displayDetails();

            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){

                case 1:
                    System.out.print("Enter Book Id");
                    String BookId = sc.nextLine();
                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author Name: ");
                    String authorName = sc.nextLine();
                    Author author =  new Author(authorName, "Bio", 1,30);
                    Book book = new Book(BookId, title, author);

                    library.addBook(book);
                    break;
            
                case 2:
                    System.out.print("Borrow Typpe (Student / Professor):");
                    String Type = sc.nextLine();
                    System.out.print("Enter Item ID to Borrow :");
                    String BorrowId = sc.nextLine();
                    Book borrowBook = null;

                    for(int i=0;i<10;i++){
                        try{
                            if(library.books[i].getItemId().equals(BorrowId)){
                                borrowBook = library.books[i];
                                break;
                            }

                        } catch(Exception e){}

                    }
                    if(borrowBook == null){
                        System.out.println("Book not found in library.");
                        break;
                    }
                    if(Type.equalsIgnoreCase("Student")){
                        student.borrow(borrowBook);
                    }
                    else{
                        professor.borrow(borrowBook);
                    }
                    break;


                    case 3:
                        System.out.print("Returner (Student / Professor): ");
                        String retType = sc.nextLine();
                        if(retType.equalsIgnoreCase("Student")) student.returnItem();
                        else professor.returnItem();
                        break;

                    case 4: 
                    System.out.println("Student Borrowed :");
                    student.showBorrowedItems();
                    System.out.println("Professor borrowed :");
                    professor.showBorrowedItems();
                    break;

                case 5:
                    library.displayDetails();
                    break;
                    
                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalide choice");
                        
            }
        }
    }
}