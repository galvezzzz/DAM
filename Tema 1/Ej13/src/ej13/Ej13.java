/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej13;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int nota1, nota2, nota3;
        int mediaBoletin;
        double mediaExpediente;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nota primer trimestre: ");
        nota1 = sc.nextInt();
        System.out.println("Nota segundo trimestre: ");
        nota2 = sc.nextInt();
        System.out.println("Nota tercer trimestre: ");
        nota3 = sc.nextInt();
        
        mediaExpediente = (nota1 + nota2 + nota3) / 3.0;
        mediaBoletin = (int) mediaExpediente;
        
        System.out.println("Boletín de calificaciones: " + mediaBoletin);
        System.out.println("Expediente académico: " + mediaExpediente);
    }
    
}
