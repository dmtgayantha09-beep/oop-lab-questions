/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab07;

/**
 *
 * @author Thilan
 */
public class StudentMarkReportTest {
    public static void main(String[] args){
        
        String[] marks = {"78", "82", "absent", "90"};
        StudentMarkReport report = new StudentMarkReport(marks);
        
        try{
            int mark = report.getMarkAt(6);
            System.out.println("Mark retived: " +mark);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Selected mark position does not exist.");
            //This exception occurs because index 6 sits outside 
            //the allocation block of the array, no date stored in marks[6]
        }
        finally{
            System.out.println("Array access checking completed.");
        }
        
        System.out.println();
        
        try{
            int mark = report.getMarkAt(2);
            System.out.println("Mark retrived: " +mark);
        }
        catch(NumberFormatException e){
            System.out.println("Error: Selected mark is not a valid number.");
            //This exception occurs because the value "absent" is a non-numeric 
            //alphabetic word descriptor that cannot convert to an integer format
        }
        finally{
            System.out.println("Number conversion checking completed.");
        }
        
        System.out.println("Report checking completed.");
    }
}
 