/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg12.pkg16;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Usuario
 */
public class Main {
    static boolean nuevoAcademico(Map<Character, Academico> a, Academico nuevo, Character letra){
        a.put(letra, nuevo);
        
        
        return false;
    }
    public static void main(String[] args) {
        
        String nombre;
        String ingreso;
        Character letra;
        Scanner sc = new Scanner(System.in);
        Map<Character,Academico> a = new TreeMap<>();
        
        for (int i = 0; i < 1; i++) {
            System.out.print("Letra: ");
            letra = sc.nextLine().charAt(0);
            
            System.out.print("Nombre: ");
            nombre = sc.nextLine();
            
            System.out.print("Año de ingreso: ");
            ingreso = sc.nextLine();
            
            nuevoAcademico(a, new Academico(nombre, ingreso), letra);
        }
        
        
        System.out.println(a);
    }
    
}
