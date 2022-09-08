package aula09.model;

import aula09.exception.ContaException;

public class Poupanca implements Conta {
    private String titular;
    private Double saldo;

    public Poupanca(String titular, Double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
    
    @Override
    public String toString() {
        return "Poupanca [titular= " + titular + " saldo=" + saldo + "]";
    }

    public String getTitular() {
        return titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    @Override
    public Boolean saque(Double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        }
        throw new ContaException("Saldo insuficiente !");
    }

    @Override
    public Boolean deposito(Double valor) {
        if (valor > 0) {
            saldo += valor;
            return true;
        }
        throw new ContaException("Valor de depósito inválido !");
    }

    
}
