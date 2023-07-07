
package br.com.techint.concessionaria.domain.carro;

import java.time.LocalDateTime;

public class Carro {
    
    private Long id;
    private String marca;
    private String modelo;
    private String cor;
    private int anoDeFabricacao;
    private int kilometragem;
    private DocumentacaoCarro documentacao;
    private LocalDateTime dataCadastro;
}