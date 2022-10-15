/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.odd_or_even_number;

/**
 *
 * @author deepika
 */
import java.util.*;

public class Odd_or_Even_number {

    public static void main(String[] args) {
        
        Scanner xy = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int c = xy.nextInt();
        int m = c%2;
        
        if(m==0)
        {System.out.println("This number is an Even Number");
        }
        else
        {System.out.println("This number is an Odd number");
        }
        xy.close();
    }
}
