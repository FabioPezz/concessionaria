package br.com.techint.concessionaria.domain.cliente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.techint.concessionaria.domain.venda.Venda;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    
    private ClienteService clienteService;

     @GetMapping("/listarclientes")
    public List<Cliente> listarClientes(){

        return clienteService.ListarTodos();
    }

    @PostMapping("/cadastrarcliente")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente salvarCliente(@RequestBody Cliente cliente){
    
        return clienteService.adicionarCliente(cliente);

    }
}
