/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenud3.pkg5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ExamenUD35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int num, dig, suma = 0, crapulo, aux, suma2=0, dig2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        num = sc.nextInt();

        /*aux = num;
        //Sacamos los dígitos del número
        while (num > 0) {
            dig = num % 10;
            num /= 10;
            suma += dig;
        }
        //Comprobamos si la suma de ambos dígitos es mayor a 10.
        if (suma < 10) {
            crapulo = suma;
            System.out.println("El crápulo de " + aux + " será " + crapulo);
            
        //Si el crápulo es mayor que 10 calculamos la suma de los dígitos
        } else if (suma >= 10) {
            while (suma > 0) {
                dig2 = suma % 10;
                suma /= 10;
                suma2 += dig2;
            }
            System.out.println("El crápulo de " + aux + " será " + suma2);
        }*/
        
        do{
            crapulo = 0;
            while(num>0){
                dig = num % 10;
                crapulo += dig;
                num /= 10;
            }
            
            if(crapulo >= 10){
                num = crapulo;
            }
            while(num>0){
                System.out.println("El crápulo es " + crapulo);
            }
        }
        
    }
}
