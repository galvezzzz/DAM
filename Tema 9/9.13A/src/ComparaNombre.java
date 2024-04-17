import java.util.Comparator;

public class ComparaNombre implements Comparator {
    public int compare;

    @Override
    public int compare(Object o1, Object o2) {
        String nombre1 = ((Futbolista)o1).nombre;
        String nombre2 = ((Futbolista)o2).nombre;

        return nombre1.compareTo(nombre2);
    }
}
