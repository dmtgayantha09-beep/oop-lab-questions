/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab07;

/**
 *
 * @author Thilan
 */
public class StudentAverageTest {
    public static void main(String[] args){
        
        //create an object
        StudentAverageCalculator calculator = new StudentAverageCalculator(350, 0);
        
        try{
            System.out.println("Avarage Marks: " + calculator.calculateAvarage());
        }
        catch(ArithmeticException e){
            System.out.println("Error: Number of students cannot be zero.");
        }
        
        finally{
            System.out.println("Average calculation completed.");
        }
        
        System.out.println("Program continues...");
    }
    
    //This exception occurs because the application attempts an 
    //integer division by zero, which is mathematically undefined in Java
}
