/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog6112pastpaper2023q2;

import java.util.Scanner;

/**
 *
 * @author conno
 */
public class Prog6112PastPaper2023Q2 {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);
        
        System.out.print("Enter the current staff number: ");
        int staffNumber = sn.nextInt();
        System.out.print("Enter the staff hiring location: ");
        String staffLocation = sl.nextLine();
        
        System.out.println();
        StaffHiring sh = new StaffHiring(staffNumber, staffLocation);
        sh.printStaffHiring();
        
    }
}
