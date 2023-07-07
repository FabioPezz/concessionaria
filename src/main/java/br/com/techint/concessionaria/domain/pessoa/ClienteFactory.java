package br.com.techint.concessionaria.domain.pessoa;

import java.util.Date;
import java.util.List;

public class ClienteFactory {
    
    public Cliente cliente;

    public void comNomeCelularesCpfCidadeDataCadastro(String nome, List<Celular> celulares, String cpf, String cidade, Date dataCadastro){
        this.cliente = new Cliente( nome,celulares, cpf, cidade, dataCadastro);
    }

    }
