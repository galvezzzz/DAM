/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author Usuario
 */
public class Triangulo implements Sonido{

    @Override
    public void voz() {
        System.out.println("¡Clin!");
    }
    
    @Override 
    public void vozDurmiendo(){
        System.out.println("");
    }
    
}
