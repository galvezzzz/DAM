/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movilidad;

/**
 *
 * @author Usuario
 */
public class motos extends vehiculos {

    public int cilindrada;

    public motos(String marca, String modelo, Tipo tipo, int cilindrada) {
        super(marca, modelo, tipo);

        this.cilindrada = cilindrada;
    }
    
    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Cilindrada: " + cilindrada);
        
    }

}
