/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maritimo;

import movilidad.vehiculos;

/**
 *
 * @author Usuario
 */
public class Yate extends vehiculos {
    
    int eslora;
    
    public Yate(String marca, String modelo, Tipo tipo,int eslora) {
        super(marca, modelo, tipo);
        
        this.eslora = eslora;
    }
    
    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Eslora: " + eslora);
        
    }
    
    
}
