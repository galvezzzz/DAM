/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package refuerzo3;

/**
 *
 * @author Usuario
 */
public class Perro extends Animal{

    public Perro(String reproduccion, String alimentacion, double peso, char sexo) {
        super(reproduccion, alimentacion, peso, sexo);
    }

    public void Ladrar() {
        System.out.println("Guau");
    }

    public void Calmarse() {
        System.out.println("U ´ᴥ` U");

    }

    public void buscarHueso() {

        int aleatorio = (int) (Math.random() * 10);

        System.out.println("Tu número: " + aleatorio);

        if (aleatorio > 6) {
            System.out.println("Tobi trae un hueso :)");
        } else {
            System.out.println("Tobi no trae nada :(");
        }

    }
}
