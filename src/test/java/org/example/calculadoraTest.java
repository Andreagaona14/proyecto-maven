package org.example;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class calculadoraTest {
    @Test
    public void testSumar(){
        calculadora Calculadora = new calculadora();
        assertEquals(5, Calculadora.sumar(2,3), "El resultado de la suma de: 5");
        assertEquals(0, Calculadora.restar(-1,1), "El resultado de la suma de:  0");

    }

    public void testRestar(){
        calculadora Calculadora = new calculadora();
        assertEquals(3, Calculadora.restar(5,2), "El resultado de la resta es : 3");
        assertEquals(-2, Calculadora.restar(3,5), "El resultado de la resta es : -2");
    }
}
