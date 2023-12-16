package br.com.techint.concessionaria.domain.carro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
