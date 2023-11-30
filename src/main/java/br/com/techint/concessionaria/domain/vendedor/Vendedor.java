package br.com.techint.concessionaria.domain.vendedor;

import java.util.Date;

import br.com.techint.concessionaria.domain.celular.Celular;
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
@Table(name = "vendedor")
public class Vendedor {
  
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id_vendedor;

    @Column(name = "nome_vendedor", nullable = false)
    public String nomeVendedor;

    @Column(name = "id_celular", nullable = false)
    public Celular celular;

    @Column(name = "cpf", nullable = false)
    public String cpf;

    @Column(name = "data_contratacao", nullable = false)
    public Date dataContratacao;

    @Column(name = "senha", nullable = false)
    public String senha;

}
