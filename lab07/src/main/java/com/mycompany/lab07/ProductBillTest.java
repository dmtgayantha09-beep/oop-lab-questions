/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab07;

/**
 *
 * @author Thilan
 */
public class ProductBillTest {
    public static void main(String[] args){
    ProductBill bill = new ProductBill("1400.00", "three");
    
    try{
        double total = bill.calculateTotal();
        System.out.println("Total Bill: " + total);
    }
    catch(NumberFormatException e){
        System.out.println("Error: Price and quantity must be valid numbers.");
    }
    finally{
        System.out.println("Product bill calculation completed.");
    }
    
    System.out.println("Program continues...");
    }
    
    //This exception occurs because the String literal "two" 
    //cannot be processed by Integer.parseInt() into a legal scalar intiger
}