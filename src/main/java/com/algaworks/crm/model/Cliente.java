package com.algaworks.crm.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity //definindo classe como entidade da base de dados
public class Cliente {

    @Id //definindo atributo como chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // definindo estratégia para geração de valores deste atributo, como o autoincrement
    private Long id;

    @Column(nullable = false) //definindo atributo como não nulo
    private String nome;

    @Column(nullable = false)
    private Long telefone;
}
