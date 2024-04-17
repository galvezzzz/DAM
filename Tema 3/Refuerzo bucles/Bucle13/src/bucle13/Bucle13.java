/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucle13;

import java.util.Scanner;

/**
 *
 * @author bichi
 */
public class Bucle13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*Escribe un programa que lea una lista de diez números y determine cuántos
          son positivos, y cuántos son negativos.*/
        Scanner sc = new Scanner(System.in);
        int num, cont=0, aprobado=0, susp=0;
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce un número del 1 al 10: ");
            num = sc.nextInt();
            cont++;
            
            if(num<5){
                susp = susp + 1;
            }else{
                aprobado = aprobado + 1;
            }
        }
        System.out.println("Habrá " + aprobado + " alumnos aprobados y " + susp + " alumnos suspensos.");
    }
    
}
