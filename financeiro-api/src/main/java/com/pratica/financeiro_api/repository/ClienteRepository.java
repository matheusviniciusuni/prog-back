package com.pratica.financeiro_api.repository;

import com.pratica.financeiro_api.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    
    Cliente findById(long id);
    Cliente findByNome(String nome);
    Cliente findByCpf(String cpf);
}
