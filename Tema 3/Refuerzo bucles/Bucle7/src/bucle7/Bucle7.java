/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucle7;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Bucle7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num=0, intentos=4, clave=1234;
        Scanner sc = new Scanner(System.in);
        
        
  
        while(intentos!=0 && num != clave){
            System.out.print("Introduce la combinación de cuatro cifras: ");
            num = sc.nextInt();
            
            intentos--;
            
            if(num == clave){
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
            }else{
                System.out.println("Fallaste, te quedan " + intentos + " intentos");
            }
        }        
    }
}
        
            
            
