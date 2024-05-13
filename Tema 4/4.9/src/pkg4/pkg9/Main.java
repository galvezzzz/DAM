/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4.pkg9;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println(max(6,4,1));
    }
    static int max(int a, int b, int c){
        int mayor;
        
        mayor = max(a, b);
        mayor = max(mayor, c);
        
        return mayor;
    }
    static int max(int a, int b) {
        int mayor;
        if (a > b) {
            mayor = a;
        } else {
            mayor = b;
        }
        return mayor;
    }
}
