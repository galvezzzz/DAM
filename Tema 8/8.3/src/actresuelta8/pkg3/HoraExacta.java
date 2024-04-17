/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actresuelta8.pkg3;

/**
 *
 * @author Usuario
 */
public class HoraExacta extends Hora {

    private int segundos;

    public HoraExacta(int hora, int minutos, int segundos) {
        super(hora, minutos);
        this.segundos = segundos;
    }

    public boolean setsegundos(int segundos) {

        boolean posible = false;

        if (segundos >= 0 && segundos < 60) {

            this.segundos = segundos;
            posible = true;
        }

        return posible;
    }

    @Override
    public void inc() {

        segundos++;
        if (segundos > 59) {

            segundos = 0;
            super.inc();
        }
    }

    @Override
    public String toString() {

        String result = super.toString();
        result += ":" + segundos;

        return result;
    }

    @Override
    public boolean equals(Object o) {

        boolean igual = false;
        HoraExacta otraHora = (HoraExacta) o;

        if (this.hora == otraHora.hora && this.minutos == otraHora.minutos && this.segundos == otraHora.segundos) {

            igual = true;
        }

        return igual;
    }
}
