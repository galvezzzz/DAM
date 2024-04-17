/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg13;

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
        
        int suma=0, nota, aAprobado=0, aSusp=0, aCond=0;
        
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 6; i++) {
            System.out.print("Introduzca una nota: ");
            nota = sc.nextInt();
            suma++;
            
            if(nota>4){
                aAprobado+=1;
            }else if(nota==4){
                aCond+=1;
            }else if(nota<4){
                aSusp+=1;
            }
        }
        System.out.println("Alumnos aprobados: " + aAprobado);
        System.out.println("Alumnos condicionados: " + aCond);
        System.out.println("Alumnos suspensos: " + aSusp);
    }
    
}
