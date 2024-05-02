/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colecciongenericos;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author Usuario
 */
public class ColeccionGenericos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        Contenedor<Integer> c1 = new Contenedor<Integer>();
//        Contenedor<Integer> c2 = new Contenedor<>();
//        Contenedor<String> c3 = new Contenedor<>();
//        
//        c1.guardar(4);
//        System.out.println(c1.extraer());
//        System.out.println(c1.extraer());
//        
//        c3.guardar("IES Belén");
//        System.out.println(c3.extraer());



        //Uso de las interfaces parametrizadas comparable y comparator
        Cliente clientes[] = {
            new Cliente("1", "Pepe"),
            new Cliente("2", "Rosa"),
            new Cliente("20", "Carlos"),
            new Cliente("10", "María")
        };
        
        Comparator<Cliente> orden = Comparator.naturalOrder();

        Arrays.sort(clientes, orden.reversed());
        System.out.println(Arrays.toString(clientes));
        
        Arrays.sort(clientes, new ComparaNombres().reversed());
        System.out.println(Arrays.toString(clientes));

    }

}
