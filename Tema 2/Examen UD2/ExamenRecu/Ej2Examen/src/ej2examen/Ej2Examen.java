/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2examen;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej2Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String horoscopo ="";
        int año;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce tu año de nacimiento: ");
        año = sc.nextInt();
        
        horoscopo = switch(año%12){
            case 1->{
                yield "Rata";
            }
            case 2->{
                yield "Buey";
            }
            case 3->{
                yield "Tigre";
            }
            case 4->{
                yield "Conejo";
            }
            case 5->{
                yield "Dragón";
            }
            case 6->{
                yield "Serpiente";
            }
            case 7 ->{
                yield "Caballo";
            }
            case 8 ->{
                yield "Cabra";
            }
            case 9->{
                yield "Mono";
            }
            case 10 ->{
                yield "Gallo";
            }
            case 11 ->{
                yield "Perro";
            }
            case 12 ->{
                yield "Cerdo";
            }
            default -> "El número introducido no es válido";
        };
        System.out.print(horoscopo);
    }
}
      
        