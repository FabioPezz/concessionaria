package br.com.techint.concessionaria.domain.pessoa;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.techint.concessionaria.infrastructure.Feign.Cep.CepRequest;

public class Cliente {
    
    public Cliente(String nomeCliente, String cpf, String cidade) {
        this.nomeCliente = nomeCliente;
        this.cpf = cpf;
        this.cidade = cidade;
    }

    public long id;
    public String nomeCliente;
    public List<Celular> celulares =new ArrayList<>();
    public String cpf;
    public String cidade;
    public Date dataCadastro;
    public CepRequest cep;

    public long getId() {
        return id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public List<Celular> getCelulares() {
        return celulares;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCidade() {
        return cidade;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void adicionarCelular(String numero){

        this.celulares.add(new Celular(numero));
    }

    public Cliente(String nomeCliente, List<Celular> celulares, String cpf, String cidade, Date dataCadastro) {
        this.nomeCliente = nomeCliente;
        this.celulares = celulares;
        this.cpf = cpf;
        this.cidade = cidade;
        this.dataCadastro = dataCadastro;
    }


}
