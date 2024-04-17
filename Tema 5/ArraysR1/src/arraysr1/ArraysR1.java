/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraysr1;

/**
 *
 * @author Usuario
 */
public class ArraysR1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num[] = new int [12];
        
        num[0] = 39;
        num[1] = -2;
        num[4] = 0;
        num[6] = 14;
        num[8] = 5;
        num[9] = 120;
        
        /*for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }*/
        
        //Valor recoge los valores de num según va recorriendo el arrays.
        for (int valor : num) {
            System.out.println(valor);
        }
        
    }
    
}
