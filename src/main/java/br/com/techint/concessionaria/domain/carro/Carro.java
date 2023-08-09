
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
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getAnoDeFabricacao() {
        return anoDeFabricacao;
    }
    public void setAnoDeFabricacao(int anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }
    public int getKilometragem() {
        return kilometragem;
    }
    public void setKilometragem(int kilometragem) {
        this.kilometragem = kilometragem;
    }
    public DocumentacaoCarro getDocumentacao() {
        return documentacao;
    }
    public void setDocumentacao(DocumentacaoCarro documentacao) {
        this.documentacao = documentacao;
    }
    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }
    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    
}