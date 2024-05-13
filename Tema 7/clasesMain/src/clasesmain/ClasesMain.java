/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasesmain;

import instituto.Profesor;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ClasesMain {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Alumno a = new Alumno("Pepe", 12, 4, "4444444", "123456A");
        Alumno b = new Alumno(12);
        Profesor p = new Profesor("Antonio", "4422727E", 1);

        System.out.println("Alumno A");
        System.out.println(a.dni);
        System.out.println(a.edad);
        System.out.println(a.nombre);
        
        System.out.println("");
        
        System.out.println("Alumno B");
        System.out.println(b.dni);
        System.out.println(b.edad);
        System.out.println(b.nombre);
        
        System.out.println("");
        
        System.out.println("Profesor");
        System.out.println(p.nombre);
        System.out.println(p.dni);
        System.out.println(p.nombrePermanencia);
        
    }

}
