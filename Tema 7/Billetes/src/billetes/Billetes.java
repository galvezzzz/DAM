/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package billetes;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Billetes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String cad;
        boolean esta = false;
        Tipos b[] = Tipos.values();

        //1
        for (Tipos billete : Tipos.values()) {
            System.out.println(billete);
        }

        System.out.println("");

        //2
        Tipos billete;
        System.out.print("Introduce un tipo de billete: ");
        cad = sc.nextLine();

        billete = Tipos.valueOf(cad);

        for (int i = 0; i < b.length; i++) {

            b[i].toString();

            if (b[i].equals(cad)) {
                esta = true;
            }
        }

        if (esta) {
            System.out.println("El billete está");
        } else {
            System.out.println("El billete no está");
        }

        System.out.println("");

        //3       
        switch (billete) {
            case CINCO -> {
                System.out.println("Cinco corresponde");
            }
            case DIEZ -> {
                System.out.println("Diez corresponde");
            }
            case VEINTE -> {
                System.out.println("Veinte corresponde");
            }
            case CINCUENTA -> {
                System.out.println("Cincuenta corresponde");
            }
            case CIEN -> {
                System.out.println("Cien corresponde");
            }
            case DOSCIENTOS -> {
                System.out.println("Doscientos corresponde");
            }
            default -> {
                System.out.println("El billete definido no corresponde");
            }

        }

    }

}
