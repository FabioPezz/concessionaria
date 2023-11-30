package br.com.techint.concessionaria.domain.venda;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface VendaRepository extends JpaRepository<Venda,Long> {
    
}