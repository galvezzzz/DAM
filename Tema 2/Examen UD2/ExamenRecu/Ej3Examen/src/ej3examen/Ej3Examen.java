/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3examen;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej3Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String tipo, comida, bebida;
        double precioComida=0, precioBebida=0, precio=0;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce la comida (palmera, donut, pitufo): ");
        comida = sc.nextLine();
        

        
        switch(comida){
            case "palmera" ->{
                precioComida += 1.40;
            }
            case "donut" ->{
                precioComida += 1;
            }
            case "pitufo" ->{
                System.out.print("Elige el tipo de pitufo (aceite, tortilla): ");
                tipo = sc.nextLine();
                
                switch(tipo){
                    case "aceite" ->{
                        precioComida += 1.20;
                    }
                    case "tortilla" ->{
                        precioComida +=1.60;
                    }
                }
            }
        }
        System.out.print("Introduce la bebida (zumo, cafe): ");
        bebida = sc.nextLine();
        switch(bebida){
            case "zumo" ->{
                precioBebida += 1.50;
            }
            case "cafe" ->{
                precioBebida += 1.20;
            }
        }
        precio = precioComida + precioBebida;
        System.out.println("El precio del desayuno será: " + precio);
    }
}
