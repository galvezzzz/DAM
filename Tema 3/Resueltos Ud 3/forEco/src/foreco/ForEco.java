/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package foreco;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ForEco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String eco = "Eco";
        
        System.out.print("Introduce el número de veces que se repite: ");
        int num = sc.nextInt();
        
        for(int i=1; i<=num; i++){
            System.out.println(eco);

        }
    }
    
}
