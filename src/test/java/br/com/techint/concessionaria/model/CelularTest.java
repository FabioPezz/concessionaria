package br.com.techint.concessionaria.model;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CelularTest {
    
    @Test
    void naoDeveCriarCelularComMenosDeOnzeDigitos(){

        assertThrows(NullPointerException.class, () -> new Celular(null));
        assertThrows(IllegalArgumentException.class, () -> new Celular("00000000"));

    }

}
