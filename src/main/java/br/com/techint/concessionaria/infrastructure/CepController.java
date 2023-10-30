package br.com.techint.concessionaria.infrastructure;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.techint.concessionaria.infrastructure.Feign.Cep.CepRequest;
import br.com.techint.concessionaria.service.CepService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("/endereco")
@RestController
public class CepController {

    private final CepService cepService;
    
    @GetMapping("/consulta")
    public ResponseEntity consultaCep(@RequestBody CepRequest cepRequest){
        
        return ResponseEntity.ok(cepService.execute(cepRequest));

    };
}
