package br.com.techint.concessionaria.service;

import org.springframework.stereotype.Service;

import br.com.techint.concessionaria.infrastructure.Feign.CepFeign;
import br.com.techint.concessionaria.infrastructure.Feign.CepRequest;
import br.com.techint.concessionaria.infrastructure.Feign.CepResponse;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CepService {
    
    private final CepFeign cepFeign;

    public CepResponse execute(CepRequest cepRequest){

        return cepFeign.buscaEnderecoCep(cepRequest.getCep());

    }

}
