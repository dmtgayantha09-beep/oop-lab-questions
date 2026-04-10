/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab4;

/**
 *
 * @author Thilan
 */
public abstract class StaffMember {
    //attributes
    private String fullName;
    private final String staffId;
    protected String department;
    
    //constructor
    public StaffMember(String fullName, String staffId, String department){
        this.fullName = fullName;
        this.staffId = staffId;
        this.department = department;
    }
    
    //getters
    public String getFullName(){
        return fullName;
    }
    
    public String getStaffId(){
        return staffId;
    }
    
    public String getDepartment(){
        return department;
    }
    
    //print the common staff details
    public final void displayBasicDetails(){
        System.out.println("Name: " + fullName);
        System.out.println("Staff ID: " + staffId);
        System.out.println("Department: " + department);
    }
    
    //create an abstract method calculateMonthlyPayment() that returns a double
    public abstract double calculateMonthlyPayment();
    
    //staffMember class is a parent class we do not create objects using this class
}
