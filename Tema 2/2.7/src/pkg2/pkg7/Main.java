/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2.pkg7;

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
        
        int n1, n2, n3;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Primer número: ");
        n1 = sc.nextInt();
        
        System.out.print("Segundo número: ");
        n2 = sc.nextInt();
        
        System.out.print("Tercer número: ");
        n3 = sc.nextInt();
        
        if(n1>n2 && n2>n3){
            System.out.println(n1 + " es mayor que " + n2 + " que también es mayor que " + n3);
        }
        else if(n3>n1 && n1>n2){
            System.out.println(n3 + " es mayor que " + n1 + " que también es mayor que " + n2);
        }
        else if(n2>n3 && n3>n1){
            System.out.println(n2 + " es mayor que " + n3 + " que también es mayor que " + n1);
        }
        else if(n1>n3 && n3>n2){
            System.out.println(n1 + " es mayor que " + n3 + " que también es mayor que " + n2);
        }  
        else if(n3>n2 && n2>n1){
            System.out.println(n3 + " es mayor que " + n2 + " que también es mayor que " + n1);
        }     
        else if(n2>n1 && n1>n3){
            System.out.println(n2 + " es mayor que " + n1 + " que también es mayor que " + n3);
        }
    }
}
    

