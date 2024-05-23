public class Jefe extends Personaje{

    private int vidaExtra;

    public Jefe() {
        super(20);
        this.vidaExtra = super.codigo / 2;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "\nCódigo: 1" + codigo + " | Vida: " + vida + " | Vida extra: " + vidaExtra;
    }
}
