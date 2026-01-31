package com.librarymanagementsystem;

public class Magazine extends LibraryItem{
    private int issueNo;

    public Magazine(String itemId, String title , int issueNo){
        super(itemId, title);
        this.issueNo = issueNo;

    }
    
    @Override
    public void showDetails(){
        System.out.println("Magazine id :"+itemId+"\n Title: "+title+"\n Issue Number : "+issueNo);
        
    }
}
