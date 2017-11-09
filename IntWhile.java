/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgint.pkgwhile;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class IntWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        Scanner input = new Scanner(System.in);
        
        int x;
        int y;
        int z;
        
        do {
            System.out.println("Enter x: ");        
            x = input.nextInt();
            System.out.println("You entered integer: " + x);

            System.out.println("Enter y: ");
            y = input.nextInt();
            System.out.println("You entered integer: " + y);

            System.out.println("Enter z: ");
            z = input.nextInt();
            System.out.println("You entered integer: " + z);
        
        }   while(!((y >= 3*x) && (z > (x + y))));
                 
        System.out.println("That's it!!!");
        
    }

    
}
