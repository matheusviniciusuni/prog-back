package com.pratica.financeiro_api.service;

import java.math.BigDecimal;
import java.util.List;

import com.pratica.financeiro_api.exception.RecursoNaoEncontradoException;
import com.pratica.financeiro_api.model.Conta;
import com.pratica.financeiro_api.repository.ContaRepository;
import org.springframework.stereotype.Service;

@Service 
public class ContaService {
    
    private final ContaRepository contaRepository;

    private final List<Conta> contas = List.of(
        new Conta(1L, "Ana Souza", BigDecimal.valueOf(250.00)),
        new Conta(2L, "Bruno Lima", BigDecimal.valueOf(800.00))
    );

    public ContaService(ContaRepository contaRepository) {
        this.contaRepository = contaRepository;
    }

    public Conta buscarContaPorId(Long id) throws RecursoNaoEncontradoException {
        return contaRepository.findById(id).orElseThrow(() 
            -> new RecursoNaoEncontradoException("Conta não encontrada"));
    }

    /* public List<Conta> listarContas() {
        return contas;
    } */
}
