/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package r8;

import java.util.Scanner;

/**
 *
 * @author bichi
 */
public class R8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double horas, salario;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Horas trabajadas esta semana: ");
        horas = sc.nextDouble();
        
        salario = horas*12;
        
        System.out.println("Su salario será de " + salario + " euros");
                
             
                
                
        
    }
    
}
