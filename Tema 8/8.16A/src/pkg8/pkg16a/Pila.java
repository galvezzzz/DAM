/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg8.pkg16a;

/**
 *
 * @author Usuario
 */
public class Pila extends Lista{
    
    public void apilar(Integer objeto) {
        insertarFinal(objeto);
    }
    
    void desapilar(Integer objeto) {
        eliminar(tabla.length - objeto);
    }
    
}
