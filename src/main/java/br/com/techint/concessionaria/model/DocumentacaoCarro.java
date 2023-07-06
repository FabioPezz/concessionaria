package br.com.techint.concessionaria.model;

public class DocumentacaoCarro {

    private String numeracaoDoc;

    public DocumentacaoCarro(String numeracaoDoc) {
        if((numeracaoDoc.length())!=8){

            throw new IllegalArgumentException("Numeração invalida do documento do carro");

        }
        this.numeracaoDoc = numeracaoDoc;
    }

    public String getNumeracaoDoc() {
        return numeracaoDoc;
    }

    public void setNumeracaoDoc(String numeracaoDoc) {
        this.numeracaoDoc = numeracaoDoc;
    }

}
