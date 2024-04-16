/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg12;

import java.util.Scanner;

/**
 *
 * @author bichi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        boolean suspensos = false;
        int notas;
        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce una nota del 0 al 10: ");
            notas = sc.nextInt();
            if(notas<5){
            suspensos = true;
            }
        }
        if(suspensos){
            System.out.println("Hay suspensos");
        }else{
            System.out.println("No hay suspensos");
        }
    }
}
