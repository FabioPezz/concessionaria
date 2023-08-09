package br.com.techint.concessionaria.domain.pessoa;

import java.util.List;

//esta interface ela faz a ligação dos UseCase's com o domain em si das entidades 

public interface ClienteRepository {
    
    void cadastrarCliente(Cliente cliente);

    Cliente buscarPorCpf(String cpf);

    List<Cliente> listarTodosClientes();
}
