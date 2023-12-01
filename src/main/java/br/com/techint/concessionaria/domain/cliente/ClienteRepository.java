package br.com.techint.concessionaria.domain.cliente;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

//esta interface ela faz a ligação dos UseCase's com o domain em si das entidades 

public interface ClienteRepository extends JpaRepository<Cliente,Long>{
    
}
