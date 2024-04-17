/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2.pkg11;

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
        
        int num;
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Introduzca un número del 1 al 7: ");
        num = sc.nextInt();
       
        switch (num) {
            case 1 -> {
                System.out.println("Lunes");
            }
            case 2 -> {
                System.out.println("Martes");
            }
            case 3 -> {
                System.out.println("Miércoles");
            }
            case 4 -> {
                System.out.println("Jueves");
            }
            case 5 -> {
                System.out.println("Viernes");
            }
            case 6 -> {
                System.out.println("Sábado");
            
            }
            case 7 -> {
                System.out.println("Domingo");
            }
            default ->
                System.out.println("El número no es válido");
        }
        
    }}
    
