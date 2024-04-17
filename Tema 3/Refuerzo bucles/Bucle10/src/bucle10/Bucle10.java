/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucle10;

import java.util.Scanner;

/**
 *
 * @author bichi
 */
public class Bucle10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*Escribe un programa que calcule la media de un conjunto de números positivos
        introducidos por teclado. A priori, el programa no sabe cuántos números se
        introducirán. El usuario indicará que ha terminado de introducir los datos
        cuando meta un número negativo.*/
        
        double num=0, media, suma=0, cont=0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número positivo: ");
        num = sc.nextDouble();//INICIALIZACIÓN
        
        while(num>=0){ //CONDICIÓN
            System.out.print("Introduce un número positivo: ");
            num = sc.nextDouble();
            //if(num>=0){
                suma += num;
                cont++;
            //}
            System.out.print("Introduce un número positivo: ");
            num = sc.nextDouble();
        }
        media = suma / cont;
        System.out.println("La media de los números introducidos será: " + media);
    }
}
