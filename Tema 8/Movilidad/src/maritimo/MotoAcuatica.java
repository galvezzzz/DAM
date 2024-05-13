/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maritimo;

import movilidad.motos;

/**
 *
 * @author Usuario
 */
public class MotoAcuatica extends motos {

    int numPlazas;

    public enum Acuatica {
        Recreo, Deportivo
    }

    public Acuatica tipoM;

    public MotoAcuatica(String marca, String modelo, Tipo tipo, int cilindrada, int numPlazas, Acuatica tipoM) {
        super(marca, modelo, tipo, cilindrada);
        
        this.tipoM = tipoM;

        if (numPlazas < 1) {
            this.numPlazas = 1;
        } else if (numPlazas > 4) {
            this.numPlazas = 4;
        } else if (numPlazas > 0 && numPlazas < 5){
            this.numPlazas = numPlazas;
        }
    }
    
    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Número de plazas: " + numPlazas);
        System.out.println("Tipo de moto acuática: " + tipoM);
        
        
    }

}
