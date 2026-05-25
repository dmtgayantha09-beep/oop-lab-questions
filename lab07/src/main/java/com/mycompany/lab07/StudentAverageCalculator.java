/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab07;

/**
 *
 * @author Thilan
 */
public class StudentAverageCalculator {
    //private attributes
    private int totalMarks;
    private int numberOfStudents;
    
    //constructor
    public StudentAverageCalculator(int totalmarks, int numberOfStudents){
        this.totalMarks = totalmarks;
        this.numberOfStudents = numberOfStudents;
    }
    
    //calculate the avarage marks
    public double calculateAvarage(){
        return  totalMarks / numberOfStudents;
    }
    
}
