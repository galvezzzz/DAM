/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package montoclasetest;

import monto.monto;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author juana
 */
public class MontoClaseTest {
    
    public MontoClaseTest() {
    }
    monto miMonto= new monto();
    
    
    @BeforeAll
    public static void setUpClass() {
        System.out.println("BeforeAll");
    }
    
    @AfterAll
    public static void tearDownClass() {
        System.out.println("AfterAll");
    }
    
    @Test
    public void MontoV1Test(){
    
        assertEquals("Valor introducido correcto",miMonto.ingreso(500));
    }
    
    @Test
    public void MontoNV1_1Test(){
    
        assertEquals("Error: La cantidad introducida es menor de 1",miMonto.ingreso(-500));
    }
    
    @Test
    public void MontoNV1_2Test(){
    
        assertEquals("Error: La cantidad introducida es > 1000",miMonto.ingreso(1500));
    }
}
