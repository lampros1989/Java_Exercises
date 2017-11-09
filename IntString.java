/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgint.string;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class IntString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Δώσε μου έναν ακέραιο: ");
        int x = scan.nextInt();
        System.out.println("Δώσε μου έναν αλφαριθμητικό χαρακτήρα: ");
        String b = scan.next();
        System.out.println("Συνδύασε και τις 2 μεταβλητές: " + x + b);
    }
    
}
