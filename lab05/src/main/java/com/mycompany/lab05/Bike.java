/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab05;

/**
 *
 * @author Thilan
 */
class Bike extends Vehicle {

    private int numberOfHours;
    private double hourlyRate;

    Bike(String vehicleNumber, String brand, int numberOfHours, double hourlyRate) {
        super(vehicleNumber, brand);
        this.numberOfHours = numberOfHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    double calculateRentalCost() {
        super.calculateRentalCost();
        return numberOfHours * hourlyRate;
    }
}

