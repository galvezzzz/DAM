/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package new3;

import java.util.Scanner;

/**
 *
 * @author bichi
 */
public class New3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca un número del 1 al 10: ");
        num = sc.nextInt();
        
        //Versión nueva
        
        switch(num) {
            case 1:
                System.out.println("El doble de num es 3*num: " + 3*num);
                break;
            case 2:
                System.out.println("El doble de num es 2*num: " + 2*num);
                break;
            case 3:
                System.out.println("El triple de num es 3*num: " + 3*num);
                break;
            case 4:
                System.out.println("El doble de num es 2*num: " + 2*num);
                break;
            case 5:
                System.out.println("El triple de num es 3*num: " + 3*num);
                break;
            case 6:
                System.out.println("El doble de num es 2*num: " + 2*num);
                break;
            case 7:
                System.out.println("El triple de num es 3*num: " + 3*num);
                break;
            case 8:
                System.out.println("El doble de num es 2*num: " + 2*num);
                break;
            case 9:
                System.out.println("El triple de num es 3*num: " + 3*num);
                break;
            case 10:
                System.out.println("El doble de num es 2*num: " + 2*num);
                break;
                
            default:
                System.out.println("El número no es válido");
                
    }
        
    }
}
    

