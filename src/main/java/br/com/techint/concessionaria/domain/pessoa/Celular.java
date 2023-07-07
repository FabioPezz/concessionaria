package br.com.techint.concessionaria.domain.pessoa;

public class Celular {

    public String ddd;
    public String numero;

    public Celular(String numero) {
        
        if(numero.matches("^\\([1-9]{2}\\) (?:[2-8]|9[1-9])[0-9]{3}\\-[0-9]{4}$"))  {
            this.numero = numero;
            
        }else{

            throw new IllegalArgumentException("Numeração de celular inválida");
        }

    }
    
}
