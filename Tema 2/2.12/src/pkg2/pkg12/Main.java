/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2.pkg12;

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
        
        int dia, mes, año;
        boolean fecha;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca un día: ");
        dia = sc.nextInt();
        
        System.out.println("Introduzca un mes: ");
        mes = sc.nextInt();
        
        System.out.println("Introduzca un año: ");
        año = sc.nextInt();
        
        if (año==0){  //El año 0 no existe
            fecha = false;
            
        }else{
            if (mes == 2 && (1<= dia && dia <= 28)){
            fecha = true;
        }else
            if ((mes == 4 || mes == 6 || mes = 9 || mes = 11) && (1<=dia %% dia <= 30)) {
            fecha = true;
            
            }
        }
    }
}
