/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg6.pkg1;

import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String vacia = "";
        char c = '2', a[];
        String cad = "Ey", cad1 = "Ey", 
        cad2 = "Estoy bailando salsa", cad3 = "Ayer estuve bailando",
        alondra = "a", nutria = "o";

        //Comprueba si es un digito (primeras págs
        System.out.println(Character.isDigit(c));

        //Compara strings para saber si son iguales 
        System.out.println(cad.equals(cad1));
        
        //Compara partes de la cadena
        System.out.println(cad2.regionMatches(c, cad3, c, c));
        
        //Comparar cantidad de caracteres
        System.out.println(alondra.compareTo(nutria));
        
        //Imprimir una parte
        System.out.println(cad3.substring(0,4));
        
        //Saber longitud del string
        System.out.println(cad3.length());
        
        //Buscar en cadena o -1 (palabra o caracter, a partir de...)
        System.out.println(cad2.indexOf('E', 10));
        
        //Cuenta de derecha a izquierda
        System.out.println(cad2.lastIndexOf("salsa"));
        
        //Comprueba si un string está vacío o no
        System.out.println("Vacía: " + vacia.isEmpty());
        System.out.println("Llena: " + cad.isEmpty());
        
        //Comprueba si una palabra se encuentra en la cadena
        System.out.println("Contiene: " + cad2.contains("salsa"));
        System.out.println("NO contiene: " + cad2.contains("salsas"));
        
        //Comprueba si la oración comienza con dicha palabra
        System.out.println(cad3.startsWith("Ayer"));
        
        //Comprueba si la oración termina con dicha palabra
        System.out.println(cad3.endsWith("bailando"));
        
        //Poner en mayus o minus
        System.out.println(cad2.toLowerCase());
        System.out.println(cad2.toUpperCase());
        
        //Reemplazar caracteres
        System.out.println(cad3.replace('e', '\u2661'));
        
        //Convierto array de string en array de char
        a = cad3.toCharArray();
        System.out.println(Arrays.toString(a));
        
        //Convierto un arrays de caracteres en string
        cad3 = String.valueOf(a);
        System.out.println(cad3);
        
        //Convierto un trozo de array en caracteres de String 
        cad3 = String.valueOf(a, 2, 7);
        System.out.println(cad3);
    }

}
