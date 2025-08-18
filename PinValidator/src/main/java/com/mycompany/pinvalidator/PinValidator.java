/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pinvalidator;
import java.util.Scanner;

/**
 *
 * @author 30128198
 */
public class PinValidator {

    public static void main(String[] args) {
        int correctPIN = 2025;
        int checkPIN = 0;
        boolean exit=false;
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your PIN: ");        
        while(!exit) {
            checkPIN = sc.nextInt();
            if(checkPIN == correctPIN) {
                exit = true;
            }
            else {
                System.out.print("That PIN is not correct. Please enter the correct PIN: ");
            }
        }
        System.out.println("The correct PIN has been entered. You now have access to your account.");
        sc.close();
    }
}
