/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg7.pkg13;

import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class Pila {
    
    private Lista list = new Lista();
    
    public void apilar(Integer objeto) {
        list.insertarFinal(objeto);
    }
    
    void desapilar(Integer objeto) {
        list.eliminar(list.tabla.length - 1);
    }
    
    public void mostrar(){
        list.mostrarArrays();
    }
    
}
