/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2.pkg10.pkg1;

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
        
        int nota;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce una nota entre 0 y 10: ");
        nota = sc.nextInt();
        
        switch (nota){
            case 0,1,2,3,4 -> {
                System.out.println("Insuficiente");
            }
            case 5 -> {
                System.out.println("Suficiente");
            }
            case 6 -> {
                System.out.println("Bien");
            }
            case 7,8 -> {
                System.out.println("Notable");
            }
            case 9,10 -> {
                System.out.println("Sobresaliente");
            }
            default ->{
                System.out.println("Número no válido");
            }
        }
    }
    
}
