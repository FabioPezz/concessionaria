package br.com.techint.concessionaria.model;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import br.com.techint.concessionaria.domain.pessoa.Celular;

public class CelularTest {
    
    @Test
    void naoDeveCriarCelularComMenosDeOnzeDigitos(){

        assertThrows(NullPointerException.class, () -> new Celular(null));
        assertThrows(IllegalArgumentException.class, () -> new Celular("00000000"));

    }

}
