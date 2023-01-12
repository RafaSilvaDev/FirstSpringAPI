package com.algaworks.crm.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private Long preco;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
}
