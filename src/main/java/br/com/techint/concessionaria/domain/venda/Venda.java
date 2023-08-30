package br.com.techint.concessionaria.domain.venda;

import java.sql.Date;

import br.com.techint.concessionaria.domain.carro.Carro;
import br.com.techint.concessionaria.domain.pessoa.Cliente;
import br.com.techint.concessionaria.domain.pessoa.Vendedor;

public class Venda {
    
    public Vendedor vendedor;
    public Long id_vendedor;
    public Cliente cliente;
    public Long id_cliente;
    public Carro carro;
    public Long id_carro;
    public Date dataVenda;


    public Venda(Vendedor vendedor, Cliente cliente, Carro carro) {
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.carro = carro;
    }


    public Venda(Long id_vendedor, Long id_cliente, Long id_carro) {
        
        this.id_vendedor = vendedor.getId();
        this.id_cliente = cliente.getId();
        this.id_carro = carro.getId();
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
