package br.com.techint.concessionaria.domain.venda;

import java.sql.Date;

import br.com.techint.concessionaria.domain.carro.Carro;
import br.com.techint.concessionaria.domain.pessoa.Cliente;
import br.com.techint.concessionaria.domain.pessoa.Vendedor;

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
