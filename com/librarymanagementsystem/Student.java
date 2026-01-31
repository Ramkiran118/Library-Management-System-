package com.librarymanagementsystem;

public class Student extends User {

    public Student(String userId, String name) {
        super(userId, name);
        
    }

    @Override
    public void borrow(LibraryItem item){
        if(item instanceof Book){
            super.borrow(item);
        }else{
            System.out.println("Student can only borrow books.");
        }
    }
    
}
