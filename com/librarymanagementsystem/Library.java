package com.librarymanagementsystem;

public class Library implements BookOperations{
    Book[] books = new Book[10];
    int bookcount = 0;
    

    public void addBook(Book book){
        if(bookcount < books.length){
            books[bookcount++] = book;
            System.out.println(" Book Has Been Added: "+book);

        }else{
            System.out.println(" Library is full, You can not add more books.");

        }
    }

    public void removeBook(String itemId){
        for(int i=0;i<bookcount;i++){
            if(books[i].getItemId().equals(itemId)){
                books[i] = books[--bookcount];

                // book would be added at 3 = 1,2 which is an array

                books[bookcount] = null;
                System.out.println(" Books with itemId : "+ itemId +" Has been Deleted Sucessfully.");
                return;
            }
        }

        System.out.println("Book is not found.");
    }

    public void displayDetails(){
        for(int i=0;i<bookcount;i++){
            System.out.println("\n List of books in Library: ");
            System.out.println( books[i].toString());
        }
    }
}
