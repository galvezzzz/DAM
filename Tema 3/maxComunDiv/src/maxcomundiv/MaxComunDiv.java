/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maxcomundiv;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class MaxComunDiv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a, b, menor, mcd;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el primer número: ");
        a = sc.nextInt();
        
        System.out.print("Introduce el segundo número: ");
        b = sc.nextInt();
        
        menor = (a<b) ? a : b;
        
        mcd = 1;
        while(menor>0 && mcd == 1){
            if(a%menor==0 && b%menor==0){
                mcd=menor;
            }
            menor--;
        }
        System.out.println("El MCD es " + mcd);
    }
}
