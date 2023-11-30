package br.com.techint.concessionaria.domain.celular;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class CelularService {
    
    @Autowired
    public CelularRepository celularRepository;

    public List<Celular> listarTodos(){

        return celularRepository.findAll();
    }

    public Celular cadastrarCelular(Celular celular){

        return celularRepository.save(celular);
    }
}
