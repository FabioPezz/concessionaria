package br.com.techint.concessionaria.domain.celular;


import java.io.Serializable;

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
public class Celular implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id_celular;

    @Column(name = "ddd", nullable = false)
    public String ddd;

    @Column(name = "numero", nullable = false)
    public String numero;

    
}
