/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Primos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        boolean primo;
        int n, cont, resto;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número: ");
        n = sc.nextInt();
        
        cont=2;
        primo = true;
        while(cont<n && primo){
            resto = n % cont;
            if (resto == 0){
                primo = false;
            }
            cont++;
        } 
        if(primo){
            System.out.println("Primo");
        }else{
            System.out.println("No primo");
        }
    }
}
