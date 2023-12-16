package br.com.techint.concessionaria.domain.endereco;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(name = "/endereco")
public class EnderecoController {

    private EnderecoService enderecoService;

     @GetMapping("/listarendereco")
    public List<Endereco> listarEndereco(){

        return enderecoService.ListarTodos();
    }

    @PostMapping("/cadastrarendereco")
    @ResponseStatus(HttpStatus.CREATED)
    public Endereco salvaEndereco(@RequestBody Endereco endereco){

        return enderecoService.adicionarEndereco(endereco);
    }
    
}
