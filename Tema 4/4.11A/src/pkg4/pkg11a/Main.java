/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4.pkg11a;

/**
 *
 * @author bichi
 */
public class Main {

    static void esfera(){
        int superficie, volumen;
        
        superficie = (int)((4 * Math.PI) * Math.pow(5, 2));
        volumen = (int)((4 * Math.PI)/3 * Math.pow(5, 3));
        
        System.out.println("La superficie de la esfera con radio 5 será: " + superficie);
        System.out.println("El volumen de la esfera con radio 5 será: " + volumen);
    }
    public static void main(String[] args) {
        
        esfera();
    }
    
}
