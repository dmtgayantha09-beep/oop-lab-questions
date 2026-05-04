/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab05;

/**
 *
 * @author Thilan
 */
class Car extends Vehicle {

    private int numberOfDays;
    private double dailyRate;

    Car(String vehicleNumber, String brand, int numberOfDays, double dailyRate) {
        super(vehicleNumber, brand);
        this.numberOfDays = numberOfDays;
        this.dailyRate = dailyRate;
    }

    @Override
    double calculateRentalCost() {
        super.calculateRentalCost();
        return numberOfDays * dailyRate;
    }
}

