/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg14a;

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
        
        boolean primo;
        int n, cont, total=0;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número: ");
        n = sc.nextInt();
        
        for (int i = 0; i <= n; i++) {
            primo = true;
            cont = 2;
            while(cont<i && primo){
                if((i%cont)==0){
                    primo = false;
                }
                cont++;
            }
            if(primo){
                total++;
            }
            System.out.println(total);
        }
    }
}
