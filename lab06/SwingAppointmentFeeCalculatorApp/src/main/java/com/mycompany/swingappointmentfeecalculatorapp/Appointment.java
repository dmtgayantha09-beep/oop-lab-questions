/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.swingappointmentfeecalculatorapp;

/**
 *
 * @author Thilan
 */
public class Appointment {
    // Private attributes
    private String patientName;
    private String appointmentType;
    private String patientCategory;
    private double baseFee;
    
    // Constructor
    public Appointment(String patientName, String appointmentType, String patientCategory, double baseFee){
        this.patientName = patientName;
        this.appointmentType = appointmentType;
        this.patientCategory = patientCategory;
        this.baseFee = baseFee;
    }
    
    // Getter methods
    public String getPatientName() {
        return patientName;
    }

    public String getAppointmentType() {
        return appointmentType;
    }

    public String getPatientCategory() {
        return patientCategory;
    }

    public double getBaseFee() {
        return baseFee;
    }
    
    //calculate final fee
    public double calculateFinalFee(){
        double finalFee = baseFee;
        
        if(appointmentType == "Specialist"){
            finalFee += 1500;
        } else if (appointmentType == "Online"){
            finalFee -= 500;
        }
        
        if(patientCategory == "Child"){
            finalFee -= 300;
        } else if(patientCategory == "Senior"){
            finalFee -= 500;
        }
        return finalFee;               
    }
    
    public String getAppointmentMessage(){
        if(appointmentType == "General"){
            return "General appointment selected";
        } else if(appointmentType == "Specialist"){
            return "Specialist appointment selected";
        }else {
            return "Online appointment selected";
        }
    }
}
