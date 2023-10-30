package br.com.techint.concessionaria.infrastructure;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.techint.concessionaria.domain.carro.Carro;
import br.com.techint.concessionaria.service.CarroService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/carro")
public class CarroController {
    
    @Autowired
    private CarroService service;

    @GetMapping("/listar")
    public List<Carro> listarCarros(){

        return service.listarTodos();
    }

}
