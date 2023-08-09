package br.com.techint.concessionaria.domain.pessoa;

public interface CelularRepository {
    
    void cadastrarCelular(String numeroCelular);

    void deletarCelular(String numeroCelular);
}
