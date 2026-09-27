/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog6112pastpaper2023q2;

/**
 *
 * @author conno
 */
public class StaffHiring extends Staff {
    
    public StaffHiring(int staffNumber, String staffLocation) {
        super(staffNumber, staffLocation);
    }
    
    public void printStaffHiring(){
        System.out.println("STAFF HIRING REPORT");
        System.out.println("*******************");
        System.out.println("LOCATION: " + getStaffLocation());
        System.out.println("STAFF NUMBER: " + getStaffNumber());
        System.out.println("HIRE STAFF: " + getStaffHiringProcess());
    }
    
}
