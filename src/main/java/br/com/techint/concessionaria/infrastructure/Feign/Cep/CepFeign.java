package br.com.techint.concessionaria.infrastructure.Feign.Cep;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "viacep.com.br/ws/", name = "viacep")
public interface CepFeign {
    
    @GetMapping("{cep}/json")
    CepResponse buscaEnderecoCep(@PathVariable("cep") String cep);

}
