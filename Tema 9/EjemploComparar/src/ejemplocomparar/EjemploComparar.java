/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplocomparar;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author Usuario
 */
public class EjemploComparar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Socio socios[] = {
            new Socio(1, "Pepe", "01-02-1974"),
            new Socio(5, "Rosa", "12-10-2000"),
            new Socio(2, "Manuel", "23-07-2005")
        };

        Arrays.sort(socios, new ComparaEdades().reversed());
        System.out.println(Arrays.deepToString(socios));

//        Arrays.sort(socios, new Comparator() {
//
//            @Override
//            public int compare(Object o1, Object o2) {
//                return ((Socio) o2).edad() - ((Socio) o1).edad();
//            }
//
//        });
//        System.out.print(Arrays.deepToString(socios));
    }
}
