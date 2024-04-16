/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package refuerzo15;

/**
 *
 * @author Usuario
 */
public class Refuerzo15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        primos(1,100);
    }
    static void primos(int n, int m) {

        for (int i = n; i <= m; i++) {

            if(esPrimo(i)==true)System.out.println(i);
        }
    }
    static boolean esPrimo(int n) {

        boolean primo = true;
        int cont = 2;

        while (cont < n && primo) {

            if (n % cont == 0) {
                primo = false;
            } else {
                cont++;
            }
        }
        return primo;
    }
}
