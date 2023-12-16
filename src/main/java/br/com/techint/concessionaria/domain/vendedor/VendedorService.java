package br.com.techint.concessionaria.domain.vendedor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class VendedorService {
    
    @Autowired
    public VendedorRepository  vendedorRepository;

    public List<Vendedor> ListarTodos(){

        return vendedorRepository.findAll();

    }

    public Vendedor adicionarVendedor(Vendedor vendedor){

        return vendedorRepository.save(vendedor);

    }

}
