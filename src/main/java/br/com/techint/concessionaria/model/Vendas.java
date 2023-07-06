package br.com.techint.concessionaria.model;

import java.sql.Date;

public class Vendas {
    
    public Vendedor vendedor;
    public Cliente cliente;
    public Carro carro;
    public Date dataVenda;


    public Vendas(Vendedor vendedor, Cliente cliente, Carro carro) {
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.carro = carro;
    }


    public Vendedor getVendedor() {
        return vendedor;
    }


    public Cliente getCliente() {
        return cliente;
    }


    public Carro getCarro() {
        return carro;
    }


    public Date getDataVenda() {
        return dataVenda;
    }

}
