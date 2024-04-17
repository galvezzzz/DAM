/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.dam.factorial;

/**
 *
 * @author Usuario
 */
public class Factorial {

    public int calculo(int n) {
        int fact = 1;
        if (n < 0) {
            throw new IllegalArgumentException("Número " + n + " no puede ser < 0");
        }

        for (int i = 2; i <= n; i++) {
            fact *= i;
        }

        if (fact <= 0) {
            throw new ArithmeticException("Overflow, número " + n + " demasiado grande");
        }

        return fact;
    }
}
