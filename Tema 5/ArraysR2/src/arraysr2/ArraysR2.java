/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraysr2;

/**
 *
 * @author Usuario
 */
public class ArraysR2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        char simbolo[] = new char[10];

        simbolo[0] = 'a';
        simbolo[1] = 'x';
        simbolo[4] = '@';
        simbolo[6] = ' ';
        simbolo[7] = '+';
        simbolo[8] = 'Q';

        for (int i = 0; i < simbolo.length; i++) {
            System.out.println(simbolo[i]);
        }
    }

}
