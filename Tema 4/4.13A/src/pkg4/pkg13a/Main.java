/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4.pkg13a;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Main {

    static void muestraPares(int n){

        for (int i = 1; i <= n; i++) {
            if(i % 2 == 0){

                System.out.println(i);
            }
        }
    }
    
    public static void main(String[] args) {
        
        int n;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número: ");
        n = sc.nextInt();
        
        muestraPares(n);
    }
    
}
