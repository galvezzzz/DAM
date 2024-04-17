/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package montotestest;

import monto.monto;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author juana
 */
public class MontoTestTest {
    
    public MontoTestTest() {
        
    }
    monto miMonto= new monto();
    int cantidad;
    
    @BeforeEach
    public void setUp() {
        cantidad=500;
        System.out.println("BeforeEach");
    }
    
    @AfterEach
    public void tearDown() {
        System.out.println("AfterEach");
    }
        @Test
    public void MontoV1Test(){
    
        assertEquals("Valor introducido correcto",miMonto.ingreso(cantidad));
    }
    
    @Test
    public void MontoNV1_1Test(){
        cantidad=-cantidad;
        assertEquals("Error: La cantidad introducida es menor de 1",miMonto.ingreso(cantidad));
    }
    
    @Test
    public void MontoNV1_2Test(){
    
        cantidad+=1000;
        assertEquals("Error: La cantidad introducida es > 1000",miMonto.ingreso(cantidad));
    }
    
}
