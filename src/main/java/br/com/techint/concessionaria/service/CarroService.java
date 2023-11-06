package br.com.techint.concessionaria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.techint.concessionaria.domain.carro.Carro;
import br.com.techint.concessionaria.domain.carro.CarroRepository;

@Service
public class CarroService {
     
    @Autowired
    public CarroRepository repository;

    public List<Carro> listarTodos(){

        return repository.findAll();

    }

    public Carro adicionarCarro(Carro carro){

        return repository.save(carro);

    }
}
