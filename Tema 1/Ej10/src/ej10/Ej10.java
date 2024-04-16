/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej10;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        boolean llueve, deberes, biblioteca;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("¿Está lloviendo? (true/false)");
        llueve = sc.nextBoolean();
        
        System.out.println("¿Has hecho los deberes? (true/false)");
        deberes = sc.nextBoolean();
        
        System.out.println("¿Tienes que ir a la biblioteca? (true/false");
        biblioteca = sc.nextBoolean();
        
        boolean salir = !llueve && deberes || biblioteca;
        System.out.println("¿Puede salir?: " + salir);
        
                
    }
    
}
