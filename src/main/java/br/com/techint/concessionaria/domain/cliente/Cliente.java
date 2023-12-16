package br.com.techint.concessionaria.domain.cliente;

import java.io.Serializable;
import java.util.Date;

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
@Table(name = "cliente")
public class Cliente implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id_cliente;

    @Column(name = "nome_cliente", nullable = false)
    public String nomeCliente;

    @Column(name = "id_celular", nullable = false)
    public long celulares;

    @Column(name = "cpf", nullable = false)
    public String cpf;

    @Column(name = "id_endereco", nullable = false)
    public String cidade;

    @Column(name = "data_cadastro", nullable = false)
    public Date dataCadastro;


}
