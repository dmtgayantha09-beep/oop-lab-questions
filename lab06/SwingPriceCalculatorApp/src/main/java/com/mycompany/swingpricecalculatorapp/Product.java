/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.swingpricecalculatorapp;

/**
 *
 * @author Thilan
 */
public class Product {
    //private attributes
    private String productName;
    private double unitPrice;
    private int quantity;
    
    //constructor
    public Product(String productName, double unitPrice, int quantity){
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }
    
    //getter methods
    public String getName(){
        return productName;
    }
    
    public double getPrice(){
        return unitPrice;
    }
    
    public int getQuantity(){
        return quantity;
    }
    
    public double calculateTotal(){
        return unitPrice * quantity;
    }
    
    public String getStockStatus(){
        if(quantity < 5){
            return "Low Stock";
        } else{
            return "Available";
        }
    }
    
}
