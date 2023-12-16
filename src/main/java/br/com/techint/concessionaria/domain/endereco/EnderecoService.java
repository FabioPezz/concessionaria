package br.com.techint.concessionaria.domain.endereco;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


public class EnderecoService {
    
    @Autowired
    private EnderecoRepository enderecoRepository;

    public List<Endereco> ListarTodos(){

        return enderecoRepository.findAll();

    }

    public Endereco adicionarEndereco(Endereco endereco){

        return enderecoRepository.save(endereco);

    }

}
