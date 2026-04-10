/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

/**
 *
 * @author Thilan
 */
public class Lecturer extends StaffMember{
    //private attributes
    private int courseCount;
    private double paymentPerCourse;
    
    public Lecturer(String fullName, String staffId, String department, int courseCount, double paymentPerCourse){
        super(fullName, staffId, department);
        this.courseCount = courseCount;
        this.paymentPerCourse = paymentPerCourse;
    }
    
    // calculate monthly payment
    public double calculateMonthlyPayment() {
        return courseCount * paymentPerCourse;
    }
    
    public void displayLecturerDetails(){
        displayBasicDetails();
        System.out.println("Number of Courses: " + courseCount);
        System.out.println("Pay Per Course: " + paymentPerCourse);
        
    }

}
