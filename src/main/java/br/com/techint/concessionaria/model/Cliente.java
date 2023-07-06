package br.com.techint.concessionaria.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cliente {
    
    public long id;
    public String nomeCliente;
    public List<Celular> celulares =new ArrayList<>();
    public String cpf;
    public String cidade;
    public Date dataCadastro;

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
