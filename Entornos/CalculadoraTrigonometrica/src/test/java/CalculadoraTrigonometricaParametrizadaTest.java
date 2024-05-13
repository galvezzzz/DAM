/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTrigonometricaParametrizadaTest {

    @ParameterizedTest
    @CsvSource({
            "30, 0.5, sin",
            "60, 0.866, sin",
            "30, 0.866, cos",
            "60, 0.5, cos",
            "30, 0.577, tan",
            "60, 1.732, tan"
    })
    public void testOperacionesTrigonometricas(double angulo, double resultadoEsperado, String operacion) {
        double radianes = Math.toRadians(angulo);
        double resultado = 0.0;

        switch (operacion) {
            case "sin":
                resultado = Math.sin(radianes);
                break;
            case "cos":
                resultado = Math.cos(radianes);
                break;
            case "tan":
                resultado = Math.tan(radianes);
                break;
        }

        assertEquals(resultadoEsperado, resultado, 0.001);
    }
}