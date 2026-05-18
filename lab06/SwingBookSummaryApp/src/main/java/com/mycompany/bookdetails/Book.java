/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bookdetails;

/**
 *
 * @author Thilan
 */
public class Book {
    //private variables
    private String title;
    private String author;
    private int pages;
    
    //constructor
    public Book(String title, String author, int pages){
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
    
    //getter methods
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getPages(){
        return pages;
    }
    
    //a method named getBookType()
    public String getBookType(){
        if (pages < 100){
            return "Short Book";
        }
        else{
            return "Regular Book";
        }
    }
    
    
}
