package br.com.techint.concessionaria.infrastructure;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import br.com.techint.concessionaria.domain.pessoa.HashPassword;

public class HashPasswordMD5 implements HashPassword{

    @Override
    public String cifrarSenha(String senha) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(senha.getBytes());
            byte[] bytes = md.digest();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bytes.length; i++) {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Erro ao gerar hash da senha");
        }
    }

    @Override
    public boolean averiguacaoSenha(String senhaCifrada, String senha) {
        return senhaCifrada.equals(cifrarSenha(senha)) ;
    }
    
}
