/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package refuerzo18;

/**
 *
 * @author Usuario
 */
public class Refuerzo18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        binario(300);
    }

    static void binario(int n) {

        int binario;

        while (n > 0) {

            binario = n % 2;
            n /= 2;
            System.out.print(binario);
        }
    }
}
