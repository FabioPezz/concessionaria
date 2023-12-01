package br.com.techint.concessionaria.domain.cliente;


import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,Long>{
    
}
