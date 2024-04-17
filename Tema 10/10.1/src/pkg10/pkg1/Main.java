/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg10.pkg1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Main {

    static Integer leerEntero(){
        Integer num;
        Scanner sc = new Scanner(System.in);
        
        while(true){
            
            try{
            System.out.print("Introducir entero: ");
            num = sc.nextInt();
            break;
            
            }catch(InputMismatchException ex){
                System.out.println(ex.getMessage());
            }
        }
        
        return num;
        
    }
    
    public static void main(String[] args) {
        
        System.out.println(leerEntero());
    }
    
}
