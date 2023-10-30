package br.com.techint.concessionaria.infrastructure.Feign.Cep;

import lombok.AllArgsConstructor;
import lombok.Getter;
@Getter
@AllArgsConstructor
public class CepResponse {

    private String cep;
    private String logradouro;
    private String bairro;
    private String localidade;
    private String uf;

}
