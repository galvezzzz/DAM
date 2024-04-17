/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enumerados;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
//TODOS LOS APUNTES EN LA MOODLE!!
public class Enumerados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String cad;

        NewEnum dia; //Defino una variable de tipo enumerado

        // Asigno un valor a un tipo enumerado
        dia = NewEnum.DOMINGO;

        System.out.println(dia);

        //Asigno un valor a una variable de tipo enumerado leyendo una cadena de teclado
        System.out.print("Introduce un día de la semana: ");
        cad = sc.nextLine();

        dia = NewEnum.valueOf(cad);
        System.out.println(dia);

        //Hay que tener cuidado con el case sensitive
        //Para ver orden de declaracion de una constante
        //ordinal()
        System.out.println("Posición de la constante: " + dia.ordinal());

        //Para obtener todas las constantes de tipo enumerado uso
        //método estático values()
        NewEnum unDia[] = NewEnum.values();
        System.out.println(Arrays.toString(unDia));

        //usamos enumerado dentro de switch
        switch (dia) {
            case LUNES -> {
                System.out.println("Hoy es lunes biaaach");
            }
        }

        //Defino un tipo enumerado
        enum Meses {
            ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO, AGOSTO, SEPTIEMBRE;
        }

        Meses mes = Meses.ENERO;

    }

}
