package com.librarymanagementsystem;

public class User {
    protected String userId;
    protected String name ;
    protected int maxBorrowLimt = 1;
    private LibraryItem borrowedItem;


    public User(String userId,String name){
        this.userId = userId;
        this.name = name;
        this.borrowedItem = null;

    }

    public void borrow(LibraryItem item){
        if(borrowedItem != null){
            System.out.println(name+" has already borrowed an item. User limit is over, First return item. ");

        }else if(item.isAvailable()){
            borrowedItem = item;
            item.borrowItem();
        }
    }


    public void returnItem(){
        if(borrowedItem == null){
            System.out.println(name +" has not borrowed items.");

        }
        else{
            borrowedItem.returnItem();
            borrowedItem = null;
        }
    }


    public void showBorrowedItems(){

        if(borrowedItem == null){
            System.out.println(name+" has no borrowed Items.");
        }else{
            System.out.println(name+ " has borrowed Item.");
            borrowedItem.showDetails();
        }
    }
}

