/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog6112pastpaper2023q2;

/**
 *
 * @author conno
 */
public abstract class Staff implements iStaff {

    private int staffNumber;
    private String staffLocation;
    
    Staff(int staffNumber, String staffLocation){
        this.staffNumber = staffNumber;
        this.staffLocation = staffLocation;
    }
    
    @Override
    public int getStaffNumber() {
        return staffNumber;
    }

    @Override
    public String getStaffLocation() {
        return staffLocation;
    }

    @Override
    public String getStaffHiringProcess() {
        String shouldHire;
        if(getStaffNumber() < 20){
            shouldHire = "YES";
        } else {
            shouldHire = "NO";
        }
        return shouldHire;
    }
    
}
