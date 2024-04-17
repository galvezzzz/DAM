package teoriaherencia;

/**
 *
 * @author Usuario
 */
public class empleado extends persona {

    double sueldo;

    public empleado(String nombre, byte edad, double estatura, double sueldo) {
        super(nombre, edad, estatura);
        this.sueldo = sueldo;
    }
    
    
    
    @Override
    public void mostrar(){
        System.out.println("Nombre: " + super.nombre);
        System.out.println("Edad: " + super.edad);
        System.out.println("Estatura: " + super.estatura);
        System.out.println("Sueldo: " + sueldo);
    }
    
}
