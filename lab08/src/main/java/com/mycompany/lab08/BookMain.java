/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab08;

/**
 *
 * @author Thilan
 */
public class BookMain {
    public static void main(String[] args) {
        Book firstBook = new Book(1, "Java Basics", 2500.00);
        Book secondBook = new Book(2, "OOP Guide", 3000.00);
        
        BookDAO bookDAO = new BookDAO();
        
        bookDAO.addBook(firstBook);
        bookDAO.addBook(secondBook);
        
        System.out.println("Book List");
        bookDAO.displayAllBooks();
    }
}