/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package montobasicatest;

import monto.Monto;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author bichi
 */
public class baEachTest {
    
    public baEachTest() {
    }
    Monto m = new Monto();
    int cantidad;
    
    @BeforeEach
    public void setUp() {
        cantidad = 500;
    }
    
    @AfterEach
    public void tearDown() {
        System.out.println("After each");
    }
    
    @Test
    public void montoCorrecto1() {
       
        assertEquals("Valor introducido correcto", m.ingreso(cantidad));
    }
    
    @Test
    public void montoIncorrecto1() {
        
        assertEquals("Error: La cantidad introducida es menor de 1", m.ingreso(-cantidad));
    }
    
    @Test
    public void montoIncorrecto2() {
       
        assertEquals("Error: La cantidad introducida es > 1000", m.ingreso(cantidad + 1000));
    }
    
}
