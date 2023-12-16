package br.com.techint.concessionaria.domain.venda;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.techint.concessionaria.domain.carro.Carro;

@RestController
@RequestMapping("/venda")
public class VendaController {
    
    private VendaService vendaService;

    @GetMapping("/listarvendas")
    public List<Venda> listarVendas(){

        return vendaService.ListarTodas();
    }

    @PostMapping("/salvarvenda")
    @ResponseStatus(HttpStatus.CREATED)
    public Venda salvarVenda(@RequestBody Venda venda){
    
        return vendaService.adicionarVenda(venda);

    }

}
