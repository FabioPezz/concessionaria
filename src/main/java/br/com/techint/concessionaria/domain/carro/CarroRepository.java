package br.com.techint.concessionaria.domain.carro;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface CarroRepository extends JpaRepository<Carro,Long>{
    
}
