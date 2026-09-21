package com.pratica.financeiro_api.repository;

import com.pratica.financeiro_api.model.Conta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContaRepository extends JpaRepository<Conta, Long> {
    
    Conta findById(long id);
    Conta findByTitular(String titular);
    Conta findBySaldo(double saldo);
}
