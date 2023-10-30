package br.com.techint.concessionaria.service;

import org.springframework.stereotype.Service;

import br.com.techint.concessionaria.infrastructure.Feign.Cep.CepFeign;
import br.com.techint.concessionaria.infrastructure.Feign.Cep.CepRequest;
import br.com.techint.concessionaria.infrastructure.Feign.Cep.CepResponse;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CepService {
    
    private final CepFeign cepFeign;

    public CepResponse execute(CepRequest cepRequest){

        return cepFeign.buscaEnderecoCep(cepRequest.getCep());

    }

}
