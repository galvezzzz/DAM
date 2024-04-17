/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2.pkg3;

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
        
        System.out.print("Primer número: ");
        n1 = sc.nextInt();
        
        System.out.print("Segundo número: ");
        n2 = sc.nextInt();
        
        if (n1>n2){
            System.out.println(n1);
        }
        else{
            System.out.println(n2);
        }
    }
    
}
