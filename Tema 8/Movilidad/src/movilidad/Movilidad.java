/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package movilidad;

import maritimo.MotoAcuatica;
import maritimo.MotoAcuatica.Acuatica;
import maritimo.Yate;
import movilidad.vehiculos.Tipo;

/**
 *
 * @author Usuario
 */
public class Movilidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        vehiculos v = new vehiculos("Honda", "Civic", Tipo.Terrestre);
        coches c = new coches("Honda", "Civic", Tipo.Terrestre, (byte) 4, "Azul", 250);
        motos m = new motos("Honda", "Civic", Tipo.Terrestre, 50);
        Yate y = new Yate("Honda", "Civic", Tipo.Terrestre, 45);
        MotoAcuatica ma = new MotoAcuatica("Honda", "Civic", Tipo.Acuático,45,2,Acuatica.Deportivo);
        
        ma.mostrar();
        
    }
    
}
