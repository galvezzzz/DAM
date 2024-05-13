/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buclesanidados;

/**
 *
 * @author Usuario
 */
public class BuclesAnidados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //B. Independiente
        for (int i = 1; i <= 3; i++) { //Bucle externo
            System.out.print("Fila " + i + ": ");
            for (int j = 1; j <= 5; j++) { //Bucle interno
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        //B. Dependiente
        final int n = 4;
        
        for (int i = 1; i <= n; i++) { //B. Externo
            System.out.print("Fila " + i + ": ");
            for (int j = n - i; j >= 1; j--) { //B. Interno
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
