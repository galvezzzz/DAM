/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package montobasicatest;
import monto.monto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author juana
 */
public class MontoBasicaTest {
    
    public MontoBasicaTest() {
    }
    
    @Test
    public void MontoV1Test(){
    
        monto miMonto=new monto();
        assertEquals("Valor introducido correcto",miMonto.ingreso(500));
    }
    
    @Test
    public void MontoNV1_1Test(){
    
        monto miMonto=new monto();
        assertEquals("Error: La cantidad introducida es menor de 1",miMonto.ingreso(-500));
    }
    
    @Test
    public void MontoNV1_2Test(){
    
        monto miMonto=new monto();
        assertEquals("Error: La cantidad introducida es > 1000",miMonto.ingreso(1500));
    }
}
