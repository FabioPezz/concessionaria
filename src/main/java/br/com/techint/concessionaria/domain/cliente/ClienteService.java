package br.com.techint.concessionaria.domain.cliente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.techint.concessionaria.domain.venda.Venda;

public class ClienteService {
    
    @Autowired
    public ClienteRepository clienteRepository;

    public List<Cliente> ListarTodos(){

        return clienteRepository.findAll();

    }

    public Cliente adicionarCliente(Cliente cliente){

        return clienteRepository.save(cliente);

    }
}
