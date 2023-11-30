
package br.com.techint.concessionaria.domain.carro;

import java.io.Serializable;
import java.time.LocalDateTime;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "carro")
public class Carro implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_carro;

    @Column(name = "marca", nullable = false)
    private String marca;

    @Column(name = "modelo", nullable = false)
    private String modelo;

    @Column(name = "cor", nullable = true)
    private String cor;

    @Column(name = "ano_fabricacao", nullable = false)
    private int anoDeFabricacao;

    @Column(name = "kilometragem", nullable = true)
    private int kilometragem;

    @Column(name = "numero_doc", nullable = true)
    private String documentacao;

    @Column(name = "data_cadastro", nullable = true)
    private LocalDateTime dataCadastro;
    
    
}