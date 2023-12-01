package br.com.techint.concessionaria.domain.endereco;

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
@Table(name = "endereco")
public class Endereco {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id_endereco;

    @Column(name = "nome_logradouro", nullable = false)
    public String nomeLogradouro;

    @Column(name = "numero_logradouro", nullable = false)
    public long numeroLogradouro;

    @Column(name = "bairro", nullable = false)
    public String bairro;

    @Column(name = "cidade", nullable = false)
    public String cidade;

    @Column(name = "estado", nullable = false)
    public String estado;

    @Column(name = "cep", nullable = true)
    public String cep;

    @Column(name = "complemento", nullable = true)
    public String complemento;
}
