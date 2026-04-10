/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

/**
 *
 * @author Thilan
 */
public class Lab04Main {
    public static void main(String[] args){
        //create a lecturer object
        Lecturer lec01 = new Lecturer("Dr. Kasun Perera", "L001", "Computer Science", 8, 12500);
        
        //display the lecturer details
        lec01.displayLecturerDetails();
        System.out.println("Monthly Payment: " + lec01.calculateMonthlyPayment());
    }
}
