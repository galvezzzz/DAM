/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5.pkg11a;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Main {

    static int[] buscarTodos(int t[], int clave){
        
        int tabla[];
        int num;
        
        
        
        for (int i = 0; i < 10; i++) {
            
        }
        
        
        
        
        return null;
    }
    
    public static void main(String[] args) {
        
        int clave, t[], huecos;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el número de huecos del array: ");
        huecos = sc.nextInt();
        
        t = new int[huecos];
        
        for (int i = 0; i < huecos; i++) {
            
            System.out.print("Introduce los números del array: ");
            t[i] = sc.nextInt();
        }
        
        System.out.println(Arrays.toString(t));
        
        System.out.print("Introduce el número clave: ");
        clave = sc.nextInt();
        
        
        
    }
    
}
