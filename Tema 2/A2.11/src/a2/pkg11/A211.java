/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a2.pkg11;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class A211 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num;
        boolean capicua = false;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un número: ");
        num = sc.nextInt();
        
        //Extraigo los dígitos de los números
        int u = num % 10;
        num /= 10;
        int d = num % 10;
        num /= 10;
        int c = num % 10;
        num /= 10;
        int um = num;
        
        //Compruebo si es capicúa
        if(u == um && d == c){
            capicua = true;
        }else if (um == 0 && u == c){
            capicua = true;     
        }else if (um==0 && c==0 && d==u){
            capicua = true;
        }else if (um==0 && c==0 && d==0){
            capicua = true;
        }
    
        if(capicua){
            System.out.println("El número es capicúo");
            
        }else{
            System.out.println("El número no es capicúo");
        }
    }
}

