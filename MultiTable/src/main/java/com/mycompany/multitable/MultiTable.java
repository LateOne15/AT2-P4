/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.multitable;
import java.util.Scanner;

/**
 *
 * @author 30128198
 */
public class MultiTable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int multiple, input;
        System.out.print("Enter a number to see the times tables up to 12: ");
        input = sc.nextInt();
        
        for (int i = 1; i<13; i++) {
            multiple = input*i;
            System.out.println(input + " X " + i + " = " + multiple);
        }
        
        sc.close();
    }
}
