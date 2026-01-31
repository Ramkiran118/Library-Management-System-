package com.librarymanagementsystem;

public class Author {

    private String authorName;
    private String biograph;
    private int noOfBooksPublished;
    private int age;



    public Author(String authorName, String biograph, int noOfBooksPublished, int age) {

        this.authorName = authorName;
        this.biograph = biograph;
        this.noOfBooksPublished = noOfBooksPublished;
        this.age = age;

    }

    //getter and setter :

    public String getBiograph(){

        return biograph;

    }

    public String getAuthorName(){
        return authorName;

    }

    public int getnoOfBooks(){
        return noOfBooksPublished;
    }
    
    public void setNoOfBookks(int noOfBooksPublished){
        this.noOfBooksPublished = noOfBooksPublished;

    }

    public String getAuthorDetails(){
        return authorName+","+biograph+","+noOfBooksPublished;
    }
}
