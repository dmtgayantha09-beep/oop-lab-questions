/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab07;

/**
 *
 * @author Thilan
 */
public class StudentMarkReport {
    private String[] marks;
    
    public StudentMarkReport(String[] marks){
        this.marks = marks;
    }
    
    public int  getMarkAt(int index){
        String selectedTextMark = marks[index];
        return Integer.parseInt(selectedTextMark);
    }
    
    
}
