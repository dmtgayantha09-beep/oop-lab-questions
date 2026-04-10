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
        //create lecturer and lab assistant objects
        Lecturer lec01 = new Lecturer("Dr. Kasun Perera", "L001", "Computer Science", 8, 12500);
        LabAssistant LabA01 = new LabAssistant("Mr. Chamara Sampath", "LA001", "Computer Science", 120, 850);
        
        //display the lecturer details
        lec01.displayLecturerDetails();
        System.out.println("Monthly Payment: " + lec01.calculateMonthlyPayment());
        System.out.println("======================================");
        
        //display Lan Assistant details
        LabA01.displayLabAssistant();
        
    }
}
