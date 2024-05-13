import java.io.Serializable;
import java.util.Comparator;

public class Futbolista implements Comparable{
    String dni;
    String nombre;
    Integer edad;
    Integer goles;

    public Futbolista(String dni, String nombre, Integer edad, Integer goles) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.goles = goles;
    }

    public String toString() {
        return "\nDNI: " + dni + " Nombre: " + nombre + " Edad: " + edad + " Goles: " + goles;
    }

    @Override
    public int compareTo(Object o) {
        int resultado;
        Futbolista other = (Futbolista) o;

        resultado = this.dni.compareTo(other.dni);
        return resultado;

    }

    @Override
    public boolean equals(Object o) {
        boolean same = false;

        Futbolista other = (Futbolista) o;

        if (!(o instanceof Futbolista)) {
            return false;
        }

        if (this.dni.equals(other.dni)) {
            return same = true;
        }

        return same;
    }

}
