
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "marca", nullable = false)
    private String marca;

    @Column(name = "modelo", nullable = false)
    private String modelo;

    @Column(name = "cor", nullable = false)
    private String cor;

    @Column(name = "ano_fabricacao", nullable = false)
    private int anoDeFabricacao;

    @Column(name = "kilometragem", nullable = false)
    private int kilometragem;

    @Column(name = "marca", nullable = true)
    private DocumentacaoCarro documentacao;

    @Column(name = "data_cadastro", nullable = false)
    private LocalDateTime dataCadastro;
    
    
}