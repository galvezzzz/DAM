public class Guerrero extends Personaje{

    public Guerrero() {
        super(15);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "\nCódigo: 2" + codigo + " | Vida: " +  vida + "\n";
    }
}
