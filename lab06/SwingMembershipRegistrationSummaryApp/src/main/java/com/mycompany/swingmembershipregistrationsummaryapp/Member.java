/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.swingmembershipregistrationsummaryapp;

/**
 *
 * @author Thilan
 */
public class Member {
    private String memberName;
    private String membershipType;
    private boolean newsletterSelected;
    private int numberOfMonths;
    
    public Member(String memberName, String membershipType, boolean newsletterSelected, int numberOfMonths){
        this.memberName = memberName;
        this.membershipType = membershipType;
        this.newsletterSelected = newsletterSelected;
        this.numberOfMonths = numberOfMonths;
    }
    
    //getters
    public String getMemberName() {
        return memberName;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public boolean isNewsletterSelected() {
        return newsletterSelected;
    }

    public int getNumberOfMonths() {
        return numberOfMonths;
    }
    
    // Monthly fee
    public double getMonthlyFee(){
        if(membershipType == "Premium"){
            return 2500;
        } else {
            return 1000;
        }
    }
    
    public double getMembershipFee(){
        double totalFee = getMonthlyFee() * numberOfMonths;
        
        if(newsletterSelected){
            totalFee += 200;
        }
            return totalFee;
    }
    
    public String getNewsletterText(){
        if(newsletterSelected){
            return "Yes";
        }else{
            return "No";
        }    
    }

}
