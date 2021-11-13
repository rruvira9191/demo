package com.example.demo.model;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CuentaTest {
   

    @Test
    void testNombreCuenta(){
    Cuenta cuenta = new Cuenta("Randy", new BigDecimal("100.00"));
          String esperado = "Randy";
          String real  = cuenta.getPersona();
          assertEquals(esperado, real);
          assertTrue(real.equals("Randy"));
    }

    @Test
    void testSaldo(){

        Cuenta cuenta = new Cuenta("Randy", new BigDecimal("100.12345"));
    assertEquals(100.12345, cuenta.getSaldo().doubleValue());


    }

    @Test
    @DisplayName("testeando referencias que sean iguales con el método equals.")
    void testReferenciaCuenta() {
            Cuenta  cuenta = new Cuenta("John Doe", new BigDecimal("8900.9997"));
            Cuenta cuenta2 = new Cuenta("John Doe", new BigDecimal("8900.9997"));

       // assertNotEquals(cuenta2, cuenta);
            assertEquals(cuenta2, cuenta);

        }

        
}
