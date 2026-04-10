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
        
        //call UniversityPolicy.showPolicyHeader()
        UniversityPolicy.showPolicyHeader();
        
        //call StaffMember.showSystemName()
        StaffMember.showSystemName();
        
        //print the university name
        System.out.println("University Name: " + UniversityPolicy.UNIVERSITY_NAME);
        
        
        //create lecturer and lab assistant objects
        Lecturer lec01 = new Lecturer("Dr. Kasun Perera", "L001", "Computer Science", 8, 12500);
        Lecturer lec02 = new Lecturer("Mr. Saman Gunarathna", "L002", "Physics", 12, 18500);        
        LabAssistant LabA01 = new LabAssistant("Mr. Chamara Sampath", "LA001", "Computer Science", 120, 850);
        
        
        //calculate and print a simple bonus estimate for the lecturer and the lab assistant using calculateBonus(...)
        double lecturerBonus = UniversityPolicy.calculateBonus(lec01.calculateMonthlyPayment());
        double assistantBonus = UniversityPolicy.calculateBonus(LabA01.calculateMonthlyPayment());
        System.out.println("Lecturer Bonus: " + lecturerBonus);
        System.out.println("Lab Assistant Bounus: " + assistantBonus);
        
        
        //display the lecturer details
        lec01.displayLecturerDetails();
        System.out.println("Monthly Payment: " + lec01.calculateMonthlyPayment());
        System.out.println("======================================");
        
        
        //display Lab Assistant details
        LabA01.displayLabAssistant();
        
        //print the total number of created staff objects
        System.out.println("Number of Staff Members: " + StaffMember.getStaffCount());
        
        
    }
}
