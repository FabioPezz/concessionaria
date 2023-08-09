package br.com.techint.concessionaria.domain.pessoa;

public interface HashPassword {

    String cifrarSenha(String senha);

    boolean averiguacaoSenha(String senhaCifrada, String senha  );
    
}
