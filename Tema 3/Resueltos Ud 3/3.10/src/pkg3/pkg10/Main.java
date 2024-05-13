/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg10;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int suma=0, impar;
        for(int i=1; i<=10; i++){
            impar = i*2 -1; 
            suma = suma + impar; //suma += impar
        }
        System.out.println(suma);
    }
}
