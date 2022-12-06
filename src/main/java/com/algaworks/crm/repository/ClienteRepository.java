package com.algaworks.crm.repository;

import com.algaworks.crm.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //definindo classe como repository do projeto
public interface ClienteRepository extends JpaRepository<Cliente, Long> { //JpaRepository recebe o tipo da entidade para o repositorio e o tipo de sua chave primeria
    // não é necessário implementar essa classe, pois o Spring data JPA fornece a implementação com principais métodos
}
