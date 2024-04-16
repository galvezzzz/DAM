/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5.pkg12;

import java.util.Arrays;
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

        int n, m;
        int matriz[][] = new int[5][5];

        Scanner sc = new Scanner(System.in);

        for (n = 0; n < matriz.length; n++) {
            for (m = 0; m < matriz[n].length; m++) {
                matriz[n][m] = 10 * n + m;
            }

        }

        System.out.println(Arrays.deepToString(matriz));

    }

}
