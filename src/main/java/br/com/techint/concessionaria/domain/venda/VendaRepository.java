package br.com.techint.concessionaria.domain.venda;

import java.util.List;

import br.com.techint.concessionaria.domain.carro.Carro;
import br.com.techint.concessionaria.domain.pessoa.Cliente;
import br.com.techint.concessionaria.domain.pessoa.Vendedor;

public interface VendaRepository {
    
    void CadastrarVenda(Carro carro, Cliente cliente, Vendedor vendedor);

    List<Venda> ApresentarVendasPorCliente(Cliente cliente);

    List<Venda> ApresentarVendasPorVendedor(Vendedor vendedor);
}