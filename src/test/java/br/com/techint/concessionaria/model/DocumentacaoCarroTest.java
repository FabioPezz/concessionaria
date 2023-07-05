package br.com.techint.concessionaria.model;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class DocumentacaoCarroTest {

    @Test
    void naoDeveCriarDocumentosMenorQueOitoDigitos(){
        assertThrows(NullPointerException.class, () -> new DocumentacaoCarro(null));
        assertThrows(IllegalArgumentException.class, () -> new DocumentacaoCarro(""));
        assertThrows(IllegalArgumentException.class, () -> new DocumentacaoCarro("34345"));
    }



}
