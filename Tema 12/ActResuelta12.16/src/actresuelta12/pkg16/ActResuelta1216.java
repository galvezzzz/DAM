/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actresuelta12.pkg16;

import static java.lang.Character.isLetter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Alberto
 */
public class ActResuelta1216 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Character letra;
        int anio;
        String nombre;

        Map<Character, Academico> academia = new TreeMap<>();

        for (int i = 0; i < 2; i++) {

            System.out.println("Registro del academico #" + (i + 1));
            System.out.print("Ingresa el caracter: ");
            letra = sc.next().charAt(0);
            while (!isLetter(letra)) {

                System.out.println("Error debe de ingresar una letra");
                System.out.print("Ingresa el caracter: ");
                letra = sc.next().charAt(0);
            }
            System.out.print("Ingresa el nombre del academico: ");
            nombre = sc.next();
            System.out.print("Ingresa el año de ingreso de dicho academico: ");
            anio = sc.nextInt();
            nuevoAcademico(academia, new Academico(nombre, anio), letra);
        }
        System.out.println("__________________________________________");
        System.out.println("Orden por letra: " + academia);

        Collection<Academico> sinLetra = academia.values();

        List<Academico> listaSinLetra = new ArrayList<>(sinLetra);

        Collections.sort(listaSinLetra);

        System.out.println("__________________________________________");

        System.out.println("Por nombre sin letra: " + listaSinLetra);

        //Por de ingreso
        Comparator<Academico> comparaIngresos = new Comparator<>() {

            @Override
            public int compare(Academico a1, Academico a2) {
                return a1.anioIngreso - a2.anioIngreso;
            }
        };

        System.out.println("__________________________________________");

        Collections.sort(listaSinLetra, comparaIngresos);
        System.out.println("Por año sin letra: " + listaSinLetra);

        //Para que aparezca la letra (clave)
        Set<Map.Entry<Character, Academico>> conLetra = academia.entrySet();

        List<Map.Entry<Character, Academico>> listaConLetra = new ArrayList<>(conLetra);

        //Se ordena por año de ingreso
        Collections.sort(listaConLetra, new Comparator<>() {

            @Override
            public int compare(Map.Entry<Character, Academico> a1, Map.Entry<Character, Academico> a2) {

                return a1.getValue().anioIngreso - a2.getValue().anioIngreso;
            }
        });

        System.out.println("__________________________________________");

        System.out.println("Orden por nombre: " + listaConLetra);

    }

    static boolean nuevoAcademico(Map<Character, Academico> academia, Academico nuevo, Character letra) {

        boolean insertado = false;

        if ((letra >= 'A' && letra <= 'Z') || (letra >= 'a' && letra <= 'z') || letra == 'ñ' && letra == 'Ñ') {

            academia.put(letra, nuevo);
            insertado = true;
        } else {

            System.out.println("El caracter ingresado no es válido, tiene queser una letra");
        }

        return insertado;
    }

}
