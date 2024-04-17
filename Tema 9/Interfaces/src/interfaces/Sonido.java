/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

/**
 *
 * @author Usuario
 */
public interface Sonido {
    
    // Atributos: son todos final y static
    int version = 1;
    
    // Métodos abstractos
    void voz();
    
    //Método por defecto
    default void vozDurmiendo(){
        System.out.println("zzz");
    }
    
    static void bostezo(){
        System.out.println("*bostezo*");
    }
    
}
