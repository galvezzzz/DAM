import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void mostrarEjercito(List lg){
        System.out.println(lg);
    }
    public static void main(String[] args) {
        List<Object> lg = new ArrayList<>();
        for (int i = 0; i < Math.random() * 4 + 1; i++) {
            lg.add(new Guerrero());
        }
        lg.add(new Jefe());

        mostrarEjercito(lg);
    }

}