package clasecollection;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author Alberto
 */
public class ClaseCollection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Cliente> clientes = new ArrayList<>();
        Collection<Cliente> cc = clientes;
        
        //Añadir datos a la lista
        cc.add(new Cliente("1" , "Pepe", "07-05-1924"));
        cc.add(new Cliente("23" , "Rosa", "12-05-2003"));
        cc.add(new Cliente("5" , "Mario", "23-12-2010"));

        System.out.println(cc);
        System.out.println("");
        
        //Eliminar 
        
        cc.remove(new Cliente("23" , "Rosa", "12-05-2003"));
        System.out.println("Rosa eliminada: \n"+cc);
        
        System.out.println("");
        
        //Limpiar lista
        cc.clear();
        System.out.println("Lista vacía: \n" + cc);
        System.out.println("");
        
        //devolver cantidad de elementos de la lista
        System.out.println("Tamaño de la lista: " + cc.size());
        System.out.println("");
        //devuelve true si la coleccion esta vacia y false en caso contrario
        System.out.println("Coleccion vacia: " + cc.isEmpty());
        System.out.println("");
        
        //Devuelve true si dicho objeto aparece en la colección o false cuando no aparece en la colección
        System.out.println("Añadimos elementos a la coleccion: ");
        cc.add(new Cliente("1" , "Pepe", "07-05-1924"));
        cc.add(new Cliente("23" , "Rosa", "12-05-2003"));
        cc.add(new Cliente("5" , "Mario", "23-12-2010"));
        System.out.println(cc);
        System.out.println("Tamaño de la lista: " + cc.size());
        System.out.println("");
        
        System.out.println("Coleccion vacia: " + cc.isEmpty());
        System.out.println("");
        
        System.out.println("Comprobar si la coleccioón contiene el bojeto con dni 5: " + cc.contains(new Cliente("5" , "Mario", "23-12-2010")));
        System.out.println("");
        
        //Definimos un iterador para recorrer la coleción
        System.out.println("Recorremos la colecciones con un método iterador: ");
        Iterator<Cliente> it = cc.iterator();
        
        Cliente p;
        while(it.hasNext()){
        
            p= it.next();
            System.out.print(p);
        }
        
        System.out.println("");
        
        //Borramos de la colección aquellos clienes nacidos antes del 2000
        //Vuelve a crear el iterador, porque el anterior apunta al final de la coledcción
        it = cc.iterator();
        
        while(it.hasNext()){
        
            p = it.next();
            if(p.fechaNacimiento.compareTo(LocalDate.of(2000,1,1))< 0){
            
                it.remove();
            };
        }
        
        System.out.println("Borramos los clientes que nacieron antes del 2000: ");
        System.out.println(cc);
        
    }
    
}
