/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package montobasicatest;

import monto.Monto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author bichi
 */
public class montoBasicaTest {

    public montoBasicaTest() {
    }
    
    Monto m = new Monto();

    @Test
    public void montoCorrecto1() {
       
        assertEquals("Valor introducido correcto", m.ingreso(500));
    }
    
    @Test
    public void montoIncorrecto1() {
        
        assertEquals("Error: La cantidad introducida es menor de 1", m.ingreso(-456));
    }
    
    @Test
    public void montoIncorrecto2() {
       
        assertEquals("Error: La cantidad introducida es > 1000", m.ingreso(1500));
    }

}
