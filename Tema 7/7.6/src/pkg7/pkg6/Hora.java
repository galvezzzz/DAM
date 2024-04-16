/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg7.pkg6;

/**
 *
 * @author Usuario
 */
public class Hora {

    private int hor;
    private int min;
    private int seg;
    private int n;

    //HORAS
    int getHora() {
        return hor;
    }

    void setHora(int hora) {
        if (0 <= hora && hora >= 23) {
            this.hor = hora;

        } else {
            this.hor = 0;
        }
    }
    
    //MINUTOS
    int getMinutos() {
        return hor;
    }

    void setMinutos(int minutos) {
        if (0 <= min && min >= 59) {
            this.min = min;

        } else {
            this.min = 0;
        }
    }
        
    //SEGUNDOS
    int getSegundos() {
        return seg;
    }

    void setSegundos(int segundos) {
        if (0 <= seg && seg >= 59) {
            this.seg = seg;

        } else {
            this.seg = 0;
        }
    }

    void incrementaSegundo(){
        
        if (seg == 60) {
            seg = 0;
            min++;
        }
        
        if (min == 60) {
            min = 0;
            hor++;
        }
        if (hor == 24) {
            hor = 0;
        }
    }
}
