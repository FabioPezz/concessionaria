package br.com.techint.concessionaria.domain.venda;

import br.com.techint.concessionaria.domain.carro.Carro;
import br.com.techint.concessionaria.domain.pessoa.Cliente;
import br.com.techint.concessionaria.domain.pessoa.Vendedor;

public interface VendaRepository {
    
    void CadastrarVenda(Carro carro, Cliente cliente, Vendedor vendedor);
}