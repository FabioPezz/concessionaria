package br.com.techint.concessionaria.domain.celular;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "celular")
public class Celular {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id_celular;

    @Column(name = "ddd", nullable = false)
    public Long ddd;

    @Column(name = "numero", nullable = false)
    public String numero;

    public Celular(String numero) {
        
        if(numero.matches("^\\([1-9]{2}\\) (?:[2-8]|9[1-9])[0-9]{3}\\-[0-9]{4}$"))  {
            this.numero = numero;
            
        }else{

            throw new IllegalArgumentException("Numeração de celular inválida");
        }

    }
    
}
