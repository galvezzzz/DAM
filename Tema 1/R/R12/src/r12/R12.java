/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package r12;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author bichi
 */
public class R12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double nota, notaFinal, nota2;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        System.out.print("Nota del primer examen: ");
        nota = sc.nextDouble();
        
        System.out.print("Nota deseada: ");
        notaFinal = sc.nextDouble();
        
        nota2 = (notaFinal - nota * 0.4) / 0.6;
        
        System.out.println("Para tener un " + notaFinal + " en el primer trimestre, necesitarás sacar un " + nota2 + " en el segundo examen.");
        
    }
    
}
