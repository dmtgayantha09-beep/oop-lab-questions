/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab05;

/**
 *
 * @author Thilan
 */
public class VehicleRentalTest {
    public static void main(String[] args) {

        Vehicle vehicle1 = new Car("CAR01", "Toyota", 3, 5000.0);
        Vehicle vehicle2 = new Bike("BIKE02", "CT 100", 6, 300.0);

        System.out.println("----- Car Details -----");
        vehicle1.displayVehicleInfo();
        System.out.println("Rental Cost: " + vehicle1.calculateRentalCost());

        System.out.println();

        System.out.println("----- Bike Details -----");
        vehicle2.displayVehicleInfo();
        System.out.println("Rental Cost: " + vehicle2.calculateRentalCost());

        // This is runtime polymorphism because the Vehicle reference calls
        // the overridden calculateRentalCost method based on the actual object type.
    }
}

