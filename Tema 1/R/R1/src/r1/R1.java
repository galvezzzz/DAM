/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package r1;

import java.util.Scanner;

/**
 *
 * @author bichi
 */
public class R1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n1, n2,total;
        
        System.out.print("Introduzca el primer número que quiera multiplicar: ");
        n1 = sc.nextInt();
        System.out.print("Introduzca el segundo número para multiplicarlo por el anterior introducido: ");
        n2 = sc.nextInt();
        
        total = n1 * n2;
        System.out.println("El total de la multiplicación es: " + total);
        
        
    }
    
}
