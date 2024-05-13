/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcion7;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Funcion7 {

    public static int digitoN(int n){
        int dig = 0;
        for (int i = 0; i < n; i++) {
            dig = n % 10;
            n /= 10;
        }
        return dig;
    }
    
    public static void main(String[] args) {
        
        int num, result;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un número: ");
        num = sc.nextInt();
        
        System.out.println("Introduce la posición del número: ");
        
        
        result = digitoN(n);
    }
    
}
