/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package test;

import com.dam.factorial.Factorial;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Usuario
 */
public class testFactorial {

    @Test
    void menosQueCero() {
    //El test será correcto si es menor que 0    
        Factorial f = new Factorial();
        assertThrows(IllegalArgumentException.class,
                () -> {
                    f.calculo(-1);
                    System.out.println("Prueba completada");
                });
    }

    @Test
    void igualCero() {
    //El test será correcto si es igual a 0
        Factorial f = new Factorial();
        
        assertEquals(1, f.calculo(0));
    }

    @Test
    void overflowTest() {
    //El test será correcto si nuestro número es muy grande
        Factorial f = new Factorial();

        String mensajeEsperado = "Overflow, número " + 100 + " demasiado grande";
        String mensajeCatch = "";
        
        try {
            f.calculo(100);

        } catch (ArithmeticException ae) {
            mensajeCatch = "Overflow, número " + 100 + " demasiado grande";
        }
        assertEquals(mensajeEsperado, mensajeCatch);
    }

    @Test
    void testCorrecto() {
    //El test será correcto en el caso de introducir los valores correctamente
        Factorial f = new Factorial();

        assertEquals(720, f.calculo(6));
    }
}
