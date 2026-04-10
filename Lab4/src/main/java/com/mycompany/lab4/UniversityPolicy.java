/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

/**
 *
 * @author Thilan
 */
public final class UniversityPolicy {
    //attributes
    public static final String UNIVERSITY_NAME = "University Of Kelaniya";
    public static final double BONUS_RATE = 0.05;
    
    //create a public static method showPolicyHeader()
    public static void showPolicyHeader(){
        System.out.println("========================================");
        System.out.println("   " + UNIVERSITY_NAME + " Payment System");
        System.out.println("========================================");
    }
    
    //create a public static method calculateBonus(double monthlyPayment)
    public static double calculateBonus(double monthlyPayment){
        return monthlyPayment * BONUS_RATE;
    }
    
    //final classes have fixed variable values that can not be changed in subclsses.
}
