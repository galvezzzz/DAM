/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg8.pkg1;

/**
 *
 * @author Usuario
 */
public class Hora {

    private int hora;
    private int minuto;

    public Hora(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;

    }

    public void inc() {
        this.minuto += 1;

        if (minuto == 60) {
            minuto = 0;
            hora += 1;
        }
        
        if (hora == 24) {
            hora = 0;
        }
    }

    boolean setMinutos(int minuto) {

        boolean valido = false;

        if (minuto < 60 && minuto >= 0) {
            this.minuto = minuto;
            valido = true;
        }
        return valido;
    }

    boolean setHoras(int hora) {

        boolean valido = false;

        if (hora < 24 && hora >= 0) {
            this.hora = hora;
            valido = true;
        }
        return valido;
    }

    @Override
    public String toString() {

        String reloj;
        reloj = hora + ":" + minuto;
        return reloj;
    }
}
