/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2.pkg2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n1, n2;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el primer número: ");
        n1 = sc.nextInt();
        
        System.out.print("Introduce el segundo número: ");
        n2 = sc.nextInt();
       
        if(n1 == n2) {
            System.out.println("Iguales");
        }
        else{
            System.out.println("Distintos");
        }
    }
    
}
