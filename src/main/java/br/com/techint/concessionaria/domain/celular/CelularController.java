package br.com.techint.concessionaria.domain.celular;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/celular")
public class CelularController {
    
    
    public CelularService celularService;

    @GetMapping("/listar")
    public List<Celular> listarCelular(){

        return celularService.listarTodos();
    }

    @PostMapping("/cadastrar")
    @ResponseStatus(HttpStatus.CREATED)
    public Celular adicionarCelular(@RequestBody Celular celular){
    
        return celularService.cadastrarCelular(celular);

    }
}
