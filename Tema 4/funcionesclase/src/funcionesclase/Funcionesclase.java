/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionesclase;

/**
 *
 * @author Usuario
 */
public class Funcionesclase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(sumar(1.0, 1.0, 1.0));
        System.out.println(sumar(1.0, 1.0));
    }

    static double sumar(double n1, double n2, double n3) {
        double suma = n1 + n2 + n3;

        return suma;
    }

    static double sumar(double n1, double n2) {
        double suma = n1 + n2;

        return suma;
    }

}
