/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfaces;

/**
 *
 * @author Usuario
 */
public class Interfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Perro p = new Perro();
        Triangulo t = new Triangulo();
        Sonido s = new Perro();
        
        /*
        p.voz();
        t.voz();
        // Realiza lo que indiquemos a la derecha
        s.voz();
        */
        
        //Para acceder a atributos estáticos se utilizan las clases clase.ejemplo
        /*System.out.println(Sonido.version);
        System.out.println(Triangulo.version);
        System.out.println(Perro.version);*/
        
        /*
        Métodos de extensión (implementados)
        Pueden ser: 
         - Públicos o privados
         - Estáticos o no 
         - Caso concreto: Método por defecto (público y estático)
        */
        
        p.vozDurmiendo();
        t.vozDurmiendo();
        Sonido.bostezo();
        
    }
    
}
