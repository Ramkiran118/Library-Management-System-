package com.librarymanagementsystem;

public class Book extends LibraryItem {
    final Author author;

   
    public Book(String itemId, String title, Author author) {
       super(itemId, title);
       this.author = author;
    }

    @Override
    public String toString(){
        return "Book{" +
                "title='" + title +'\''+
                ", itemId='" + itemId +'\''+
                ", author'" + author.getAuthorName() +'\''+
                '}';
    }

}

