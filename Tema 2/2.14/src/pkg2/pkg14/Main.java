/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2.pkg14;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int dia, mes, año, diaDelMes;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca un día: ");
        dia = sc.nextInt();
        
        System.out.print("Introduzca un mes: ");
        mes = sc.nextInt();
        
        System.out.print("Introduzca un año: ");
        año = sc.nextInt();
        
        diaDelMes = switch(mes){
            case 2 -> 28;
            case 4, 6, 9, 11 -> 30;
            default -> 31;
        };
        
        dia++;
        if (dia > diaDelMes){
            dia = 1;
        }
        if (mes > 12){
            mes = 1;
            año++;
        }
        if (año==0){    
            año = 1;
        }
        System.out.println("Día " + dia + " del mes " + mes + " del año " + año);
    }
    
}
