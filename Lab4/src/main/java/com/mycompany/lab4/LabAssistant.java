/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

/**
 *
 * @author Thilan
 */
public class LabAssistant extends StaffMember{
    //private attributes
    private int hoursWorked;
    private double hourlyRate;
    
    //constructor
    public LabAssistant(String fullName, String staffId, String department, int hoursWorked, double hourlyRate){
        super(fullName, staffId, department);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    
    //calculate monthly salary of an assistant
    public double calculateMonthlyPayment(){
        return hourlyRate * hoursWorked;
    }
    
    public void displayLabAssistant(){
        displayBasicDetails();
        System.out.println("Worked Hours: " + hoursWorked);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Monthly Payment :" + calculateMonthlyPayment());
    }
    
    //department is used peotected access modifier it can be used in child classes.
    
}
