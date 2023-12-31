package br.com.techint.concessionaria.domain.vendedor;

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
@RequestMapping(name = "/vendedor")
public class VendedorController {
    
    
    private VendedorService vendedorService;

    @GetMapping("/listarvendedores")
    public List<Vendedor> listarVendedores(){

        return vendedorService.ListarTodos();
    }

    @PostMapping("/cadastrarvendedor")
    @ResponseStatus(HttpStatus.CREATED)
    public Vendedor salvarVendedor(@RequestBody Vendedor vendedor){

        return vendedorService.adicionarVendedor(vendedor);
    }
}
