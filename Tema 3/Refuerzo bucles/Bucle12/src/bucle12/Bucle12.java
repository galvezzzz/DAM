/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucle12;

import java.util.Scanner;

/**
 *
 * @author bichi
 */
public class Bucle12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n, n1, n2, cont=0, suma;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        n = sc.nextInt();
        n1 = n+1;
        
        for (int i = 0; i < 10; i++) {
            cont++;
            
            System.out.println(n);
            System.out.println(n1);
            
            suma = n + n1;
            System.out.println(suma);
            
            n2 = suma + 1;

            System.out.println(n2);
            n2++;
        }
    }
    
}
