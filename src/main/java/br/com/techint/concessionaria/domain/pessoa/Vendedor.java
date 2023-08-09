package br.com.techint.concessionaria.domain.pessoa;

import java.util.Date;

public class Vendedor {
    
    public long id;
    public String nomeVendedor;
    public Celular celular;
    public String cpf;
    public Date dataContratacao;

    public String senha;

    public long getId() {
        return id;
    }

    public String getNomeVendedor() {
        return nomeVendedor;
    }

    public Celular getCelular() {
        return celular;
    }

    public String getCpf() {
        return cpf;
    }

    public Date getDataContratacao() {
        return dataContratacao;
    }
}
