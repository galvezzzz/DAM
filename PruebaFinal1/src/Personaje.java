public abstract class Personaje {
    protected static int cont = 0;
    protected int vida;
    protected int codigo;

    public Personaje(int vida) {
        this.codigo = cont++;
        this.vida = vida;
    }
}
