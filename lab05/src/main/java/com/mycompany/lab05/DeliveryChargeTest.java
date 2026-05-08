/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab05;

/**
 *
 * @author Thilan
 */
public class DeliveryChargeTest {
    public static void main(String[] args) {

        DeliveryChargeCalculator dc = new DeliveryChargeCalculator();

        System.out.println("Base Charge: " + dc.calculateCharge(1000.0));

        System.out.println("Base + Distance Charge: " + dc.calculateCharge(1000.0, 5));

        System.out.println("Base + Distance + Weight Charge: " + dc.calculateCharge(1000.0, 5, 10));

        System.out.println("Base + Express Delivery Charge: " + dc.calculateCharge(1000.0, true));

        
    }
}
