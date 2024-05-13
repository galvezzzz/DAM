/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package claseconjuntos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Alberto
 */
public class ClaseConjuntos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        TreeSet<Cliente> cc = new TreeSet<>();

        // Indicará que es false porque no se ha podido insertar, ya que hay otro igual
        // Indicará que es true porque se ha podido insertar, ya que es único
        cc.add(new Cliente("543", "Marcos", "12-11-2000"));
        cc.add(new Cliente("121", "Claudia", "21-01-2010"));
        System.out.println(cc.add(new Cliente("777", "Juan", "10-05-1977")));
        System.out.println(cc);

        System.out.println(cc.add(new Cliente("777", "Juan", "10-05-1977")));
        System.out.println(cc);

        Set<Integer> ce = new LinkedHashSet<>();
        ce.add(4);
        ce.add(1);
        ce.add(10);
        ce.add(8);

        System.out.println(ce);

        Set<Integer> ceo = new TreeSet<>();
        ceo.addAll(ce);

        System.out.println("Conjunto TreeSet: " + ceo);
        ce = ceo;

        System.out.println("Conjunto Link ordenado: " + ce);

        Set<Integer> ceo2 = new TreeSet<>(ceo);
        System.out.println("Versión 2 : " + ceo2);

        List<Cliente> lista = new ArrayList<>();
        lista.add(new Cliente("543", "Marcos", "12-11-2000"));
        lista.add(new Cliente("121", "Claudia", "21-01-2010"));
        lista.add(new Cliente("777", "Juan", "10-05-1977"));

        Collections.sort(lista);
        System.out.println("SORT" + lista);

        int indice = Collections.binarySearch(lista, new Cliente("777", "Juan", "10-05-1977"));
        System.out.println(indice);

        //Métodos para la manipulación de datos
        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numeros.add(i);
        }

        System.out.println(numeros);

        Collections.swap(numeros, 0, 4);
        System.out.println("SWAP: " + numeros);

        Collections.replaceAll(numeros, 4, 10);
        System.out.println("REPLACE ALL: " + numeros);

        List<Integer> numeros2 = new ArrayList<>();
        for (int i = 10; i > 0; i--) {
            numeros2.add(i);

        }
        System.out.println("numeros2: " + numeros2);

        Collections.fill(numeros2, 10);
        System.out.println("FILL: " + numeros2);

        List<Integer> numeros3 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numeros3.add(i);
        }

        System.out.println("numeros3: " + numeros3);
        Collections.copy(numeros2, numeros3);
        System.out.println("numeros2 actualizado: " + numeros2);

        //Otras utilidades
        Collections.shuffle(numeros2);
        System.out.println("SHUFFLE: " + numeros2);
        
        System.out.println("FREQUENCY: " + Collections.frequency(numeros2, 10));
        
        System.out.println("MÁXIMO: " + Collections.max(numeros2));
        
        System.out.println("MÍNIMO: " + Collections.min(numeros2));
        
        Collections.reverse(numeros2);
        System.out.println("REVERSE: " + numeros2);
        
        List<Integer> unico = new ArrayList<>();
        
        unico = (List<Integer>) Collections.singleton(10);
        System.out.println(unico);
        
        
        
        
    }

}
