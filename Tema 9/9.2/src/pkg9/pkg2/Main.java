/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg9.pkg2;

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

        Scanner sc = new Scanner(System.in);

        int num;

        Lista l = new Lista();

        System.out.print("Introduce el número a encolar: ");
        num = sc.nextInt();

        while (num > 0) {

            l.Encolar(num);

            System.out.print("Introduce el número a encolar: ");
            num = sc.nextInt();

        }
        
        num = l.Desencolar();
        while(num != null){
            
        }
        l.Mostrar();
    }

}
