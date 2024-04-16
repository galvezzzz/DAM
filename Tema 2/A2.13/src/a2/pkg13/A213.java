/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a2.pkg13;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class A213 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int comidaDiaria, numAnimales, kilosPorAnimal;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Cantidad de comida: ");
        comidaDiaria = sc.nextInt();
        
        System.out.print("Número de animales: ");
        numAnimales = sc.nextInt();
        
        System.out.print("Kilos por animal: ");
        kilosPorAnimal = sc.nextInt();
        
        if(kilosPorAnimal * numAnimales <= comidaDiaria){
            System.out.println("Todos los animales comerán");
        }else{
            System.out.println("Cada uno puede comer " + (comidaDiaria/numAnimales) + "kg");
        }
        
    }
    
}
