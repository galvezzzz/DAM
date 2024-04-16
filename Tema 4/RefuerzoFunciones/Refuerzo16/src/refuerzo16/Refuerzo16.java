/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package refuerzo16;

/**
 *
 * @author Usuario
 */
public class Refuerzo16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        esCapicua(1,99999);
    }
    static void esCapicua(int n,int m) {

        int reverse;
        
        for (int i = n; i <= m; i++) {
            
            reverse = voltea(i);
            if (reverse == i) {
            System.out.println(reverse);
            }
        }

    }
    static int voltea(int n) {

        int revers = 0;

        while (n > 0) {

            revers = (revers * 10) + (n % 10);
            n /= 10;
        }

        return revers;
    }
}
