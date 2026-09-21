package com.pratica.financeiro_api.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;

@Entity 
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titular;
    private BigDecimal saldo;

    public Conta(Long id, String titular, BigDecimal saldo) {
        this.id = id;
        this.titular = titular;
        this.saldo = saldo;
    }

    public Long getId() { return id; }
    public String getTitular() { return titular; }
    public BigDecimal getSaldo() { return saldo; }
}
