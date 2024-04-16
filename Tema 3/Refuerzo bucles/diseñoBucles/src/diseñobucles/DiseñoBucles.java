/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diseñobucles;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class DiseñoBucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num;
        boolean encontrado = false;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número: ");
        num = sc.nextInt();
        intentos = 1;
        
        while(num%2!=0){
            num++;
        }
                    encontrado = true;
    }
}
