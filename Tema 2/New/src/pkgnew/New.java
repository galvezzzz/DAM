/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgnew;

import java.util.Scanner;

/**
 *
 * @author bichi
 */
public class New {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int nota;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número entre 0 y 10: ");
        nota = sc.nextInt();
        
        //Versión nueva
        switch(nota){
            case 0 ->
                System.out.print("Cero");
            case 1 ->
                System.out.print("Uno");
            case 2 ->
                System.out.println("Dos");
            case 3 ->
                System.out.println("Tres");
            case 4 ->
                System.out.println("Cuatro");
            case 5 ->
                System.out.println("Cinco");
            case 6 ->
                System.out.println("Seis");
            case 7 ->
                System.out.println("Siete");
            case 8 ->
                System.out.println("Ocho");
            case 9 ->
                System.out.println("Nueve");
            case 10 ->
                System.out.println("Diez");
                
            
        }
    }
    
}
