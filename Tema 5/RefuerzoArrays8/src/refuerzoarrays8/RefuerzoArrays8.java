/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package refuerzoarrays8;

import java.util.Scanner;

/**
 *
 * @author bichi
 */
public class RefuerzoArrays8 {

    static void diagramaBarras(String meses[], int media[]) {

        for (int i = 0; i < meses.length; i++) {

            imprimirTemperatura(media[i], meses[i]);
        }
    }

    static void imprimirTemperatura(int temperaturaMedia, String mes) {

        String barra = "";

        for (int i = 0; i < temperaturaMedia; i++) {

            barra += "#";
        }
        System.out.println("");
        System.out.print(mes + " -> " + barra + "(" + temperaturaMedia + ")");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String meses[] = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        int media[] = new int[meses.length];

        for (int i = 0; i < meses.length; i++) {

            System.out.print("Ingresa la emperatura media de " + meses[i] + ": ");
            media[i] = sc.nextInt();

        }
        diagramaBarras(meses, media);

    }

}
