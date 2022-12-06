package com.algaworks.crm.controller;

import com.algaworks.crm.model.Cliente;
import com.algaworks.crm.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //anotação para apontar a classe como controladora REST, para desenvolvimento de endpoints
@RequestMapping("/clientes") //anotação para mapeamento dos endpoints para receber requisições iniciadas com '/clientes'
public class ClienteController {

    @Autowired // anotação para injetar uma instancia automaticamente
    private ClienteRepository clienteRepository;

    @GetMapping //anotação para definição deste método como GET da URI '/clientes'
    public List<Cliente> listar(){
        return clienteRepository.findAll();
    }

    @PostMapping //anotação para definição deste método como GET da URI '/clientes'
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente adicionar(@RequestBody Cliente cli){ //anotacao para converter um body de uma requisicao em um objeto java
        return clienteRepository.save(cli);
    }
}
