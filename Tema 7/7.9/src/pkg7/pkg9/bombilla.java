/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg7.pkg9;

/**
 *
 * @author Usuario
 */
public class bombilla {

    private boolean bombilla = false;
    static boolean general = true;

    void encender() {
        this.bombilla = true;
    }

    void apagar() {
        this.bombilla = false;
    }

    void estado() {
        if (general) {

            if (bombilla) {
                System.out.println("La bombilla está encendida");
            } else {
                System.out.println("La bombilla está apagada");
            }

        } else {
            System.out.println("Se ha ido la luz");
        }

    }
}
