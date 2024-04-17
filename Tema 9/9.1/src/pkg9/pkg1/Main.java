/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg9.pkg1;

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

        int encolar;
        int desencolar;
        
        Scanner sc = new Scanner(System.in);

        Lista l = new Lista();

        System.out.print("Introduce el número de números que quieres encolar: ");
        encolar = sc.nextInt();
        
        System.out.print("Introduce el número de números que quieres desencolar: ");
        desencolar = sc.nextInt();

        while (encolar > 0) {
            l.Encolar(1);
            encolar--;
        }
        
        System.out.println("Números encolados: ");
        l.Mostrar();
        
        while (desencolar > 0){
            l.Desencolar(1);
            desencolar--;
        }

        
        System.out.println("Tabla después de desencolar: ");
        l.Mostrar();
    }

}
