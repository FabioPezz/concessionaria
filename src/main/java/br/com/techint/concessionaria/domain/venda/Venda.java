package br.com.techint.concessionaria.domain.venda;

import java.sql.Date;

import br.com.techint.concessionaria.domain.carro.Carro;
import br.com.techint.concessionaria.domain.cliente.Cliente;
import br.com.techint.concessionaria.domain.vendedor.Vendedor;

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
@Table(name = "venda")
public class Venda implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id_venda;

    @Column(name = "id_vendedor", nullable = false)
    public Long id_vendedor;

    @Column(name = "id_cliente", nullable = false)
    public Long id_cliente;

    @Column(name = "id_carro", nullable = false)
    public Long id_carro;

    @Column(name = "data_venda", nullable = true)
    public Date data_venda;


}
