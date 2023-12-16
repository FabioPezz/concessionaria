package br.com.techint.concessionaria.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import br.com.techint.concessionaria.domain.carro.DocumentacaoCarro;

class DocumentacaoCarroTest {

    @Test
    void naoDeveCriarDocumentosMenorQueOitoDigitos(){
        assertThrows(NullPointerException.class, () -> new DocumentacaoCarro(null));
        assertThrows(IllegalArgumentException.class, () -> new DocumentacaoCarro(""));
        assertThrows(IllegalArgumentException.class, () -> new DocumentacaoCarro("34345"));
    }

    @Test
    void DeveCriarDocumentoComOitoDigitos(){
        String numero = "12345678";
        DocumentacaoCarro numeracaoDoc = new DocumentacaoCarro(numero);
        assertEquals(numero, numeracaoDoc.getNumeracaoDoc());
    }



}
