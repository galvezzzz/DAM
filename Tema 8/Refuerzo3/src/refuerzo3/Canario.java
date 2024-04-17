/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package refuerzo3;

/**
 *
 * @author Usuario
 */
public class Canario extends Ave{
    
    public Canario(String reproduccion, String alimentacion, double peso, char sexo) {
        super(reproduccion, alimentacion, peso, sexo);
    }
    
    @Override
    public void Pescar(){
        
        int aleatorio = (int) (Math.random() * 10 + 1);
        
        System.out.println("Tu número: " + aleatorio);
        
        if (aleatorio > 9) {
            System.out.println("Has pescado un pez!!");
        }else{
            System.out.println("No has pescado nada :(");
        }
    }

    @Override
    public void Piar() {
        System.out.println("Pio, pio, pio, pio");
    }

    @Override
    public void hacerNido() {
        System.out.print("""
                           ***
                            *
                           """
        );
    }
    
    
    
}
