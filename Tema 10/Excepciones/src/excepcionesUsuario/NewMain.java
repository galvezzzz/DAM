/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepcionesUsuario;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int edad;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Introduce tu edad: ");
            edad = sc.nextInt();

            if (edad < 0) {
                throw new ExcepcionEdadNegativa();

            }else{
                System.out.println("Edad introducida: " + edad);
            }

        } catch (ExcepcionEdadNegativa ex) {
            System.out.println(ex);
        }
    }

}
