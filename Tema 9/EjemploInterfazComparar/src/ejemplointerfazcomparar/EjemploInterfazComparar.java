/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplointerfazcomparar;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author Usuario
 */
public class EjemploInterfazComparar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        Primer Ejemplo
//        Socio s1 = new Socio(1,"Pepe", "01-03-1987");
//        Socio s2 = new Socio(2,"Rosa", "12-10-2000");
//                
//        System.out.println(s1.compareTo(s2));

        //Segundo ejemplo Parar ordenarlo de manera natural
        Socio socios[] = {
            new Socio(10, "Pepe", "01-03-1987"),
            new Socio(5, "Rosa", "12-10-2000"),
            new Socio(2, "Marta", "10-07-2010"),};
//
//        Arrays.sort(socios);
//        System.out.println(Arrays.deepToString(socios));
//
////        Ordenar por fecha        
////        ComparaEdades c= new ComparaEdades();
////        Arrays.sort(socios,c);
//        Arrays.sort(socios, new ComparaEdades());
//        System.out.println(Arrays.deepToString(socios));
//
//        //Ordenar de mas viejo a mas joven
//        Arrays.sort(socios, new ComparaEdades().reversed());
//        System.out.println(Arrays.deepToString(socios));
//        
//        //Creo un Comparador a traves de una clase ánonima orden decreciente por edades
//        Arrays.sort(socios, new Comparator(){
//        
//            public int compare(Object o1, Object o2){
//            
//                return ((Socio)o2).edad() - ((Socio)o1).edad();
//            }
//        });
//        
//        System.out.println(Arrays.deepToString(socios));
        
//        //Hago una busqueda Binaria por el orden natural
//        Arrays.sort(socios);
//        System.out.println(Arrays.deepToString(socios));
//        System.out.println(Arrays.binarySearch(socios, new Socio(1,"Pepe","01-03-1987")));
        
        //Buscar con otro criterio
        Arrays.sort(socios, new ComparaEdades());
        System.out.println(Arrays.deepToString(socios));
        Arrays.binarySearch(socios, new Socio(10,"Pepe","01-03-1987"),new ComparaEdades());
        System.out.println(Arrays.binarySearch(socios, new Socio(10,"Pepe","01-03-1987"),new ComparaEdades()));
    }

}
