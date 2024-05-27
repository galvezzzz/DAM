/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mapas;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Usuario
 */
public class Mapas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Definir un mapa
        Map<String, Double> m = new HashMap<>();

        //Insertar, método
        m.put("Juan", 1.70);
        m.put("María", 1.65);
        m.put("Ricardo", 1.85);
        m.put("Julio", 1.74);

        System.out.println("PUT: " + m);

        m.put("Ricardo", 1.90);

        System.out.println(m);

        //Otros métodos de mapas
        //Eliminar
        System.out.println("Ricardo eliminado: " + m.remove("Ricardo"));
        System.out.println("REMOVE: " + m);

        System.out.println("Paco eliminado: " + m.remove("Paco"));
        System.out.println("REMOVE: " + m);

        //Eliminar todas las entradas
        /*m.clear();
        System.out.println("CLEAR: " + m);*/
        //Obtenemos el valor de una clave
        System.out.println("GET:");
        System.out.println("Altura de Juan: " + m.get("Juan"));
        System.out.println("Altura de Juan: " + m.get("Luis"));

        //Comprobamos si hay alguna entrada con la clave k
        System.out.println("CONTAINSKEY: ");
        System.out.println("Clave Juan: " + m.containsKey("Juan"));
        System.out.println("Clave Rosa: " + m.containsKey("Rosa"));

        //Comprobamos si hay alguna entrada con el valor v
        System.out.println("CONTAINSVALUE: ");
        System.out.println("Valor 1.7: " + m.containsValue(1.7));
        System.out.println("Valor 1.95: " + m.containsValue(1.95));

        //Definimos una vista con las claves del mapa
        Set<String> claves = m.keySet();
        System.out.println("Claves del mapa: " + claves);

        //Definimos una vista con los valores del mapa
        Collection<Double> estatura = m.values();
        System.out.println("Valores del mapa: " + estatura);

        //Definimos una vista con las entradas del mapa
        Set<Map.Entry<String, Double>> entrada = m.entrySet();
        System.out.println("Entradas del mapa: " + entrada);

        // Borro un elemento de la lista de claves 
        claves.remove("Juan");
        System.out.println("Vista de claves: " + claves);
        System.out.println("Vista de mapa: " + m);

        //borramos las entradas cuyo valor sea mayor que 1.7
        //Paso 1: creamos una lista con las entradas (Hecho en la línea 76)
        //Paso 2: ccreamos un iterador para recorrer la entrada
        Map.Entry<String, Double> e;
        Iterator<Map.Entry<String, Double>> it;
        it = entrada.iterator();
        while (it.hasNext()) { //Mientras queden entradas
            e = it.next();
            if (e.getValue() > 1.7) {
                it.remove();
            }
        }
        System.out.println("BORRAR > 1.7: " + m);

    }

}
