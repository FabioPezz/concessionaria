package br.com.techint.concessionaria.domain.venda;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendaService {
    
    @Autowired
    public VendaRepository vendaRepository;

    public List<Venda> ListarTodas(){

        return vendaRepository.findAll();

    }

    public Venda adicionarVenda(Venda venda){

        return vendaRepository.save(venda);

    }

}
